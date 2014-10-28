/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matt
 */
public class TeamTest {
    
    public TeamTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addUser method, of class Team.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        User user = null;
        Team instance = null;
        boolean expResult = false;
        boolean result = instance.addUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsMember method, of class Team.
     */
    @Test
    public void testContainsMember() {
        System.out.println("containsMember");
        User user = null;
        Team instance = null;
        boolean expResult = false;
        boolean result = instance.containsMember(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUser method, of class Team.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        User user = null;
        Team instance = null;
        boolean expResult = false;
        boolean result = instance.removeUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeamList method, of class Team.
     */
    @Test
    public void testGetTeamList() {
        System.out.println("getTeamList");
        Team instance = null;
        String[] expResult = null;
        String[] result = instance.getTeamList();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeamName method, of class Team.
     */
    @Test
    public void testGetTeamName() {
        System.out.println("getTeamName");
        Team instance = null;
        String expResult = "";
        String result = instance.getTeamName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTeamName method, of class Team.
     */
    @Test
    public void testSetTeamName() {
        System.out.println("setTeamName");
        String teamName = "";
        Team instance = null;
        instance.setTeamName(teamName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeamMembers method, of class Team.
     */
    @Test
    public void testGetTeamMembers() {
        System.out.println("getTeamMembers");
        Team instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getTeamMembers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompanyName method, of class Team.
     */
    @Test
    public void testGetCompanyName() {
        System.out.println("getCompanyName");
        Team instance = null;
        String expResult = "";
        String result = instance.getCompanyName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
