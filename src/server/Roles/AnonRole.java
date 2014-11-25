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
public class AnonRole implements Role
{

    @Override
    public boolean canAllChat()
    {
        return false;
    }

    @Override
    public boolean canTeamChat(String team)
    {
        return team.equals("");
    }

    @Override
    public int getEnum()
    {
        return Role.E_ANON;
    }
    
    @Override
    public String toString()
    {
        return Role.ANONYMOUS;
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
    public boolean canSetCompany(TeamData oldTD, TeamData newTD)
    {
        return false;
    }

    @Override
    public int compareTo(Role o)
    {
        return getEnum() - o.getEnum();
    }

}
