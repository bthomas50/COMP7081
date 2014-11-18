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
        System.out.println("get/setTeamName");
        String expResult = "blah";
        TeamData data = new TeamData(expResult, "g628giy");
        String result = data.getTeamName();
        assertEquals(expResult, result);
        expResult = "asdfh";
        data.setTeamName(expResult);
        result = data.getTeamName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCompanyName method, of class TeamData.
     */
    @Test
    public void testGetCompanyName() {
        System.out.println("get/setCompanyName");
        String expResult = "blah";
        TeamData data = new TeamData("fg22f", "blah");
        String result = data.getCompanyName();
        assertEquals(expResult, result);
        expResult = "asdfh";
        data.setCompanyName(expResult);
        result = data.getCompanyName();
        assertEquals(expResult, result);
    }

}
