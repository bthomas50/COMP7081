/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.DB;

import java.sql.Connection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import server.TeamData;

/**
 *
 * @author Matt
 */
public class TeamsTest {
    
    public TeamsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addTeam method, of class Teams.
     */
    @Test
    public void testAddTeam() throws Exception {
        System.out.println("addTeam");
//        try(Connection conn = DB.connect())
//        {
//            for(int i = 0; i < 2; i++)
//            {
//                TeamData expResult = new TeamData(DBSuite.TEAMS[i] + "blahblah", DBSuite.COMPANIES[i]);
//                Teams.addTeam(conn, expResult);
//                TeamData result = Teams.getTeamData(conn, expResult.getTeamName());
//                assertEquals(expResult.getTeamName(), result.getTeamName());
//                assertEquals(expResult.getCompanyName(), result.getCompanyName());
//                Teams.removeTeam(conn, expResult.getTeamName());
//                        
//            }
//        }
    }

    /**
     * Test of getTeamData method, of class Teams.
     */
    @Test
    public void testGetTeamData() throws Exception {
        System.out.println("getTeamData");
//        try(Connection conn = DB.connect())
//        {
//            for(int i = 0; i < 2; i++)
//            {
//                TeamData expResult = new TeamData(DBSuite.TEAMS[i], DBSuite.COMPANIES[i]);
//                TeamData result = Teams.getTeamData(conn, expResult.getTeamName());
//                assertEquals(expResult.getTeamName(), result.getTeamName());
//                assertEquals(expResult.getCompanyName(), result.getCompanyName());
//            }
//        }
    }

    /**
     * Test of setCompany method, of class Teams.
     */
    @Test
    public void testSetCompany() throws Exception {
        System.out.println("setCompany");
//        try(Connection conn = DB.connect())
//        {
//            for(int i = 0; i < 2; i++)
//            {
//                TeamData expResult = new TeamData(DBSuite.TEAMS[i], DBSuite.COMPANIES[i] + "blahblah");
//                Teams.setCompany(conn, expResult.getTeamName(), expResult.getCompanyName());
//                TeamData result = Teams.getTeamData(conn, expResult.getTeamName());
//                assertEquals(expResult.getTeamName(), result.getTeamName());
//                assertEquals(expResult.getCompanyName(), result.getCompanyName());
//                
//                Teams.setCompany(conn, expResult.getTeamName(), DBSuite.COMPANIES[i]);
//            }
//        }
    }
}
