/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package server;

/**
 *
 * @author Brian
 */
public class TeamData
{
    private String teamName;
    private String companyName;
    
    public TeamData(String teamName, String companyName)
    {
        this.teamName = teamName;
        this.companyName = companyName;
    }
    
    public TeamData(TeamData other)
    {
        this.teamName = other.teamName;
        this.companyName = other.companyName;
    }

    public String getTeamName()
    {
        return teamName;
    }

    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }
    
}
