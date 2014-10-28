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
        Connection conn = null;
        TeamData data = null;
        Teams.addTeam(conn, data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeamData method, of class Teams.
     */
    @Test
    public void testGetTeamData() throws Exception {
        System.out.println("getTeamData");
        Connection conn = null;
        String teamName = "";
        TeamData expResult = null;
        TeamData result = Teams.getTeamData(conn, teamName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompany method, of class Teams.
     */
    @Test
    public void testSetCompany() throws Exception {
        System.out.println("setCompany");
        Connection conn = null;
        String teamName = "";
        String newCompany = "";
        Teams.setCompany(conn, teamName, newCompany);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
