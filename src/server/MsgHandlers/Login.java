package server.MsgHandlers;

import common.LoginMessage;
import common.Util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Connection;
import java.sql.SQLException;
import server.Company;
import server.DB.DB;
import server.DB.Users;
import server.Server;
import server.Team;
import server.User;

/**
 * This class is used by the Server to connect
 * and grab the information of a user from the database.
 * 
 * @author Brian
 */
public class Login
{
    
    private Login()
    {
    }

	//  handle login message and return the correct type of user,    
	// or an anonymous user if the login info is not found
    public static void loginUser(Server server, Socket sock) throws IOException
    {
        PrintWriter sOutput = new PrintWriter(sock.getOutputStream());
        BufferedReader sInput = new BufferedReader(new InputStreamReader(sock.getInputStream()));
        User loggedInUser = new User("Anonymous", "", "", "", "", sInput, sOutput, server);
        try
        {
            //block until we get a message.
            String msg = sInput.readLine();
            String[] strs = msg.split(" ");
            Connection conn = DB.connect();
            if(strs.length > 2 && 
               Users.getPassword(conn, strs[0], Util.mySQLCompatibleMD5(strs[1])) == Users.PwdResult.SUCCESS)
            {
                    loggedInUser =  new User(strs[0],
                                             strs[1],
                                             Users.getRole(conn, strs[0]),
                                             Users.getTeam(conn, strs[0]),
                                             Users.getCompany(conn, strs[0]),
                                             sInput, sOutput, server);
            }
            conn.close();
        } catch (SQLException ex)
        {
            DB.printSQLException(ex);
        }
        if(tryAddUserToServer(loggedInUser, server))
        {
            Team teamOnServer = getTeamOnServer(loggedInUser, server);
            teamOnServer.addUser(loggedInUser);
            Company companyOnServer = getCompanyOnServer(teamOnServer, server);
            if(!companyOnServer.containsMember(teamOnServer))
            {
                companyOnServer.addTeam(teamOnServer);
            }
        }
    }
    
    private static boolean tryAddUserToServer(User loggedInUser, Server server)
    {
        User oldUser = server.getUser(loggedInUser.getUserID());
        if(oldUser != null)
        {
            loggedInUser.sendMessage("User " + loggedInUser.getUserID() + " already logged in.\n");
            loggedInUser.closeUserThread();
            return false;
        }
        else
        {
            server.addUser(loggedInUser);
            server.broadcast(loggedInUser.getUserID() + " has connected " + " as " + loggedInUser.getRole().toString());
            return true;
        }
    }
    
    private static Team getTeamOnServer(User loggedInUser, Server server)
    {
        Team existingTeam = server.getTeam(loggedInUser.getTeamName());
        if(existingTeam == null)
        {
            existingTeam = new Team(loggedInUser.getTeamName());
            server.addTeam(existingTeam.getTeamName(), existingTeam);
        }
        return existingTeam;
    }
    
    private static Company getCompanyOnServer(Team teamOnServer, Server server)
    {
        Company existingCompany = server.getCompany(teamOnServer.getCompanyName());
        if(existingCompany == null)
        {
            existingCompany = new Company(teamOnServer.getCompanyName());
            server.addCompany(existingCompany);
        }
        return existingCompany;
    }
}
