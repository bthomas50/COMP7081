/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package server;

import java.util.ArrayList;

/**
 *
 * @author Brian
 */
public class Company
{
    private ArrayList<Team> companyMembers;
    private String companyName;
    
    public Company(String companyName)
    {
        this.companyName = companyName;
        companyMembers = new ArrayList<>();
    }
    
    //Attempts to add a user object to teamMembers
    //Will return true if successful, false if not
    public boolean addTeam(Team team) {
        return companyMembers.add(team);
    }
    
    public boolean containsMember(Team team) {
        return companyMembers.contains(team);
    }
    
    public boolean removeUser(Team team)
    {
        return companyMembers.remove(team);
    }
    
    //Returns a string array of the userIDs of each team member
    public String[] getTeamList() {
        String[] teamList = new String[companyMembers.size()];
        int c = 0;
        for(Team t : companyMembers) {
            teamList[c++] = t.getTeamName();
        }
        return teamList;
    }
    
    //Getters and Setters
    public String getCompanyName() {
        return companyName;
    }

    public void setTeamName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Team> getTeamMembers() {
        return companyMembers;
    }
}
