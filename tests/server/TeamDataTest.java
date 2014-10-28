/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matt
 */
public class TeamDataTest {
    
    public TeamDataTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getTeamName method, of class TeamData.
     */
    @Test
    public void testGetTeamName() {
        System.out.println("getTeamName");
        TeamData instance = null;
        String expResult = "";
        String result = instance.getTeamName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTeamName method, of class TeamData.
     */
    @Test
    public void testSetTeamName() {
        System.out.println("setTeamName");
        String teamName = "";
        TeamData instance = null;
        instance.setTeamName(teamName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompanyName method, of class TeamData.
     */
    @Test
    public void testGetCompanyName() {
        System.out.println("getCompanyName");
        TeamData instance = null;
        String expResult = "";
        String result = instance.getCompanyName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompanyName method, of class TeamData.
     */
    @Test
    public void testSetCompanyName() {
        System.out.println("setCompanyName");
        String companyName = "";
        TeamData instance = null;
        instance.setCompanyName(companyName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
