/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.Roles;

import server.User;
import server.UserData;

/**
 *
 * @author Brian
 */
public class DevRole implements Role
{

    private final User user;

    public DevRole(User u)
    {
        user = u;
    }

    @Override
    public boolean canTeamChat(String teamName)
    {
        return teamName.equals(user.getTeamName());
    }

    @Override
    public boolean canAllChat()
    {
        return true;
    }

    @Override
    public String toString()
    {
        return DEVELOPER;
    }

    @Override
    public int getEnum()
    {
        return Role.E_DEV;
    }

    @Override
    public boolean canAddUser(UserData ud)
    {
        return false;
    }

    @Override
    public boolean canRemoveUser(UserData ud)
    {
        return false;
    }

    @Override
    public boolean canChangeRole(UserData oldUD, UserData newUD)
    {
        return false;
    }

    @Override
    public boolean canSetTeam(UserData oldUD, UserData newUD)
    {
        return false;
    }

    @Override
    public boolean canSetCompany(UserData ud, UserData newCompName)
    {
        return false;
    }

    @Override
    public int compareTo(Role o)
    {
        return getEnum() - o.getEnum();
    }
}
