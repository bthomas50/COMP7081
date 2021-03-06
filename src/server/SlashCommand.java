// Test Tag 1
package server;

import server.MsgHandlers.LogoutHandler;
import server.MsgHandlers.SetTeamHandler;
import server.MsgHandlers.RemoveUserHandler;
import server.MsgHandlers.SetCompanyHandler;
import server.MsgHandlers.AddUserHandler;
import server.MsgHandlers.SetRoleHandler;
import server.MsgHandlers.WhoIsInHandler;
import server.Roles.Role;

/**
 *
 * @author aequites
 */
public final class SlashCommand
{
    public static final int E_IGNORED   = 0;
    public static final int E_CONSUMED  = 1;


    private SlashCommand()
    {
    }

    public static final int process(User pUser, String sMsg)
    {
        String[] as;
        String s = sMsg;
        int eRole;

        int i, l;

        if (pUser == null || s == null || (l = s.length()) == 0)
        {
            return E_CONSUMED;
        }

        for (i = 0; i < l; ++i)
        {
            char c = s.charAt(i);

            if (c == ' ')
            {
                continue;
            }

            if (c == '/')
            {
                break;
            }

            return E_IGNORED; // not a command
        }

        eRole = pUser.getRoleEnum();
        
        as = s.trim().split("\\s+");
        l = as.length;
        s = as[0];
        
        switch (s)
        {
            case "/t":
                if (l > 1)
                {
                    // team chat: return the string's char index after /t plus a space
                    return sMsg.indexOf("/t") + 3;
                }
            break;

            case "/c":
                if (l > 1)
                {
                    // company chat: return the string's char index after /c plus a space as a negative number
                    return -(sMsg.indexOf("/c") + 3);
                }
            break;
            
            case "/adduser":
                if (l < 4)
                {
                    s = "Server> Usage: /adduser name password role [team] [company]\n";
                }
                else
                {
                    try
                    {
                        String sNewRole = as[3].toLowerCase();

                        if (as[2].equals("null")) as[2] = "";
                        
                        if (l == 4)
                        {
                            AddUserHandler.handle(pUser, as[1], as[2], sNewRole, "");
                        }
                        else
                        {
                            as[4] = as[4].equals("null") ? "" : as[4].toLowerCase();

                            AddUserHandler.handle(pUser, as[1], as[2], sNewRole, as[4]);
                        }

                        s = "Server> User \"" + as[1] + "\" added with role \"" + sNewRole + "\"\n";
                    }
                    catch (Exception ex)
                    {
                        s = "Server> Error adding user \"" + as[1] + "\" - message: " + ex.getMessage() + "\n";
                    }
                }
                break;

            case "/deluser":
                if (l < 2)
                {
                    s = "Server> Usage: /deluser name\n";
                }
                else
                {
                    try
                    {
                        RemoveUserHandler.handle(pUser, as[1]);
                        s = "Server> User \"" + as[1] + "\" deleted\n";
                    }
                    catch (Exception ex)
                    {
                        s = "Server> Error deleting user \"" + as[1] + "\" - message: " + ex.getMessage() + "\n";
                    }
                }
                break;

            case "/setrole":
                if (l < 3)
                {
                    s = "Server> Usage: /setrole name role\n";
                }
                else
                {
                    try
                    {
                        String sNewRole = as[2].toLowerCase();
                        SetRoleHandler.handle(pUser, as[1], sNewRole);

                        s = "Server> User \"" + as[1] + "\" set to role \"" + sNewRole + "\"\n";
                    }
                    catch (Exception ex)
                    {
                        s = "Server> Error setting role for user \"" + as[1] + "\" - message: " + ex.getMessage() + "\n";
                    }
                }
                break;
            case "/setteam":
                if(l < 2)
                {
                    s = "Server> Usage: /setteam name team\n";
                    break;
                }
                try
                {
                    String sNewTeam = (l > 2) ? as[2].toLowerCase() : "";
                    
                    SetTeamHandler.handle(pUser, as[1], sNewTeam);
                    s = "Server> User \"" + as[1] + "\" set to team \"" + sNewTeam + "\"\n";
                }
                catch (Exception ex)
                {
                    s = "Server> Error setting team for user \"" + as[1] + "\" - message: " + ex.getMessage() + "\n";
                }
                break;
            case "/setcompany":
                if(l < 2)
                {
                    s = "Server> Usage: /setcompany name company\n";
                    break;
                }
                try
                {
                    String sNewCompany = (l > 2) ? as[2].toLowerCase() : "";

                    SetCompanyHandler.handle(pUser, as[1], sNewCompany);
                    s = "Server> User \"" + as[1] + "\" set to company \"" + sNewCompany + "\"\n";
                }
                catch (Exception ex)
                {
                    s = "Server> Error setting company for user \"" + as[1] + "\" - message: " + ex.getMessage() + "\n";
                }
                break;
            case "/logout":
                try
                {
                    LogoutHandler.handle(pUser);
                }
                catch(Exception ex)
                { }
                return E_CONSUMED;
            case "/whoisin":
                try
                {
                    WhoIsInHandler.handle(pUser);
                }
                catch(Exception ex)
                { }
                return E_CONSUMED;
            default:
                s = "Server> Valid commands: /adduser /deluser /setrole /setteam /setcompany /t /c\n";
        }

        pUser.sendMessage(s);

        return E_CONSUMED;
    }
}
