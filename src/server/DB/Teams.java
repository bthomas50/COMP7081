/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package server.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import server.TeamData;

/**
 *
 * @author Brian
 */
public class Teams
{
    private static final String tableName = "teams";
    
    private static final String addTeam = "INSERT INTO " + tableName + " VALUES(?,?)";
    private static final String removeTeam = "DELETE FROM " + tableName + " WHERE team_id = ?";
    
    private static final String getCompany = "SELECT company FROM " + tableName + " WHERE team_id = ?";
    private static final String setCompany = "UPDATE " + tableName + " SET company = ? WHERE team_id = ?";

    public static void addTeam(Connection conn, TeamData data) throws SQLException
    {
        try (PreparedStatement stmt = conn.prepareStatement(addTeam))
        {
            stmt.setString(1, data.getTeamName());
            stmt.setString(2, data.getCompanyName());
            if (stmt.executeUpdate() == 0)
                throw new SQLException("team already exists");
        }
    }
    
    public static void removeTeam(Connection conn, String teamName) throws SQLException
    {
        try (PreparedStatement stmt = conn.prepareStatement(removeTeam))
        {
            stmt.setString(1, teamName);

            if (stmt.executeUpdate() == 0)
                throw new SQLException("team does not exist");
        }
    }
    
    public static TeamData getTeamData(Connection conn, String teamName) throws SQLException
    {
        try (PreparedStatement stmt = conn.prepareStatement(getCompany))
        {
            stmt.setString(1, teamName);
            
            ResultSet rs = stmt.executeQuery();
            
            if(!rs.next())
                throw new SQLException("user does not exist");
            
            return new TeamData(teamName, rs.getString(1));
        }
    }

    public static void setCompany(Connection conn, String teamName, String newCompany) throws SQLException
    {
        try (PreparedStatement stmt = conn.prepareStatement(setCompany))
        {
            stmt.setString(1, newCompany);
            stmt.setString(2, teamName);
            
            if (stmt.executeUpdate() == 0)
                throw new SQLException("team does not exist");
        }
    }
}
