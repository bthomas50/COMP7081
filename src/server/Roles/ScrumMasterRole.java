/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package server.Roles;

import server.User;

/**
 *
 * @author Brian
 */
public class ScrumMasterRole implements Role
{
    User user;
    public ScrumMasterRole(User u)
    {
        user = u;
    }
    @Override
    public boolean canSetTeam(String username, String newTeam)
    {
        //this method isn't fully implemented yet - needs UserData to work properly.
        return false;
    }

    @Override
    public boolean canSetCompany(String username, String newCompany)
    {
        //this method isn't fully implemented yet - needs UserData to work properly.
        return false;
    }
    @Override
    public boolean canAddUser(String team)
    {
        //this method isn't fully implemented yet - needs UserData to work properly.
        return user.getTeamName().equals(team);
    }

    @Override
    public boolean canRemoveUser(String team)
    {
        //this method isn't fully implemented yet - needs UserData to work properly.
        return user.getTeamName().equals(team);
    }

    @Override
    public boolean canChangeRole(String team, String newRole)
    {
        //this method isn't fully implemented yet - needs UserData to work properly.
        return compareTo(newRole) > 0 && 
            user.getTeamName().equals(team);
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
        return SCRUM_MASTER;
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
                return 1;
            case SCRUM_MASTER:
                return 0;
            case ADMINISTRATOR:
                return -1;
            default:
                return -1;
        }
    }

    @Override
    public int getEnum()
    {
        return Role.E_MASTER;
    }

}
