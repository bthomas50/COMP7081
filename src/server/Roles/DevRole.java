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
public class DevRole implements Role
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
        return true;
    }

    @Override
    public boolean canAllChat()
    {
        return false;
    }
    
    @Override
    public String toString()
    {
        return DEVELOPER;
    }

    @Override
    public int compareTo(String o)
    {
        switch(o)
        {
            case ANONYMOUS:
                return 1;
            case USER:
                return 1;
            case DEVELOPER:
                return 0;
            case SCRUM_MASTER:
                return -1;
            case ADMINISTRATOR:
                return -1;
            default:
                return -1;
        }
    }

    @Override
    public int getEnum()
    {
        return Role.E_DEV;
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
        return true;
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
