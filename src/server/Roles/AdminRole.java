/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.Roles;

import server.TeamData;
import server.UserData;

/**
 *
 * @author Brian
 */
public class AdminRole implements Role
{

    @Override
    public boolean canAllChat()
    {
        return true;
    }

    @Override
    public String toString()
    {
        return ADMINISTRATOR;
    }

    @Override
    public int compareTo(Role o)
    {
        return getEnum() - o.getEnum();
    }

    @Override
    public int getEnum()
    {
        return Role.E_ADMIN;
    }

    @Override
    public boolean canAddUser(UserData ud)
    {
        return true;
    }

    @Override
    public boolean canRemoveUser(UserData ud)
    {
        return true;
    }

    @Override
    public boolean canChangeRole(UserData oldUD, UserData newUD)
    {
        return true;
    }

    @Override
    public boolean canTeamChat(String teamName)
    {
        return true;
    }

    @Override
    public boolean canSetTeam(UserData oldUD, UserData newUD)
    {
        return true;
    }

    @Override
    public boolean canSetCompany(TeamData oldTD, TeamData newTD)
    {
        return true;
    }

}
