/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package server.Roles;

import server.UserData;

/**
 *
 * @author Brian
 */
public class AnonRole implements Role
{
    @Override
    public boolean canSetTeam(String username, String newTeam)
    {
        return false;
    }

    @Override
    public boolean canSetCompany(String username, String newCompany)
    {
        return false;
    }
    @Override
    public boolean canAddUser(String team)
    {
        return false;
    }

    @Override
    public boolean canRemoveUser(String team)
    {
        return false;
    }

    @Override
    public boolean canChangeRole(String team, String newRole)
    {
        return false;
    }

    @Override
    public boolean canTeamChat(String team)
    {
        return false;
    }

    @Override
    public boolean canAllChat()
    {
        return true;
    }
    
    @Override
    public int compareTo(String o)
    {
        return -1;
    }

    @Override
    public int getEnum()
    {
        return Role.E_ANON;
    }

    @Override
    public boolean canAddUser(UserData ud) {
        return false;
    }

    @Override
    public boolean canRemoveUser(UserData ud) {
        return false;
    }

    @Override
    public boolean canChangeRole(UserData oldUD, UserData newUD) {
        return false;
    }

    @Override
    public boolean canTeamChat(UserData ud) {
        return false;
    }

    @Override
    public boolean canSetTeam(UserData oldUD, UserData newUD) {
        return false;
    }

    @Override
    public boolean canSetCompany(UserData ud, UserData newCompName) {
        return false;
    }
    
}
