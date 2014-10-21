/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package server.MsgHandlers;

import java.sql.Connection;
import server.DB.DB;
import server.DB.Teams;
import server.TeamData;
import server.User;

/**
 *
 * @author Brian
 */
public class SetCompanyHandler
{

    public static void handle(User pUser, String teamName, String newCompany) throws Exception
    {
        try(Connection conn = DB.connect())
        {
            TeamData oldTD = Teams.getTeamData(conn, teamName);
            TeamData newTD = new TeamData(oldTD);
            newTD.setCompanyName(newCompany);
            if(pUser.getRole().canSetCompany(oldTD, newTD))
            {
                Teams.setCompany(conn, teamName, newCompany);
                conn.close();
            }
            else throw new Exception("Insufficient permission");
        }
    }
    
}
