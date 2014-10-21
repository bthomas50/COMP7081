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
public class ScrumMasterRole implements Role
{
    private final User user;
    public ScrumMasterRole(User u)
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
        return SCRUM_MASTER;
    }

    @Override
    public int compareTo(Role other)
    {
        return getEnum() - other.getEnum();
    }
    @Override
    public int getEnum()
    {
        return Role.E_MASTER;
    }

    @Override
    public boolean canAddUser(UserData ud) {
        return user.getUD().getTeam().equals(ud.getTeam()) && 
               compareTo(ud.getRole()) > 0;
    }

    @Override
    public boolean canRemoveUser(UserData ud) {
        return user.getUD().getTeam().equals(ud.getTeam()) && 
               compareTo(ud.getRole()) > 0;
    }

    @Override
    public boolean canChangeRole(UserData oldUD, UserData newUD) {
        return compareTo(oldUD.getRole()) > 0 &&  //can only modify people with lower roles
               compareTo(newUD.getRole()) > 0 &&  //can only change roles to lower roles
               user.getUD().getTeam().equals(newUD.getTeam()); //can only affect users on the same team
    }

    @Override
    public boolean canSetTeam(UserData oldUD, UserData newUD) {
        return (
                   oldUD.getTeam().equals("") &&               //can move people from empty team to own team
                   newUD.getTeam().equals(user.getTeamName()) && 
                   compareTo(oldUD.getRole()) > 0              //who have lower roles
                ) ||
                (
                   newUD.getTeam().equals("") &&               //can move people from own team to empty team
                   oldUD.getTeam().equals(user.getTeamName()) &&
                   compareTo(oldUD.getRole()) > 0              //who have lower roles
                );
    }

    @Override
    public boolean canSetCompany(UserData oldUD, UserData newUD) {
        //Same thing as canSetTeam(..), except with company name
        return false;
    }

}
