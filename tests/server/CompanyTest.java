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
public class CompanyTest {
    
    public CompanyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addTeam method, of class Company.
     */
    @Test
    public void testAddTeam() {
        System.out.println("addTeam");
        Team team = null;
        Company instance = null;
        boolean expResult = false;
        boolean result = instance.addTeam(team);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsMember method, of class Company.
     */
    @Test
    public void testContainsMember() {
        System.out.println("containsMember");
        Team team = null;
        Company instance = null;
        boolean expResult = false;
        boolean result = instance.containsMember(team);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUser method, of class Company.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        Team team = null;
        Company instance = null;
        boolean expResult = false;
        boolean result = instance.removeUser(team);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeamList method, of class Company.
     */
    @Test
    public void testGetTeamList() {
        System.out.println("getTeamList");
        Company instance = null;
        String[] expResult = null;
        String[] result = instance.getTeamList();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompanyName method, of class Company.
     */
    @Test
    public void testGetCompanyName() {
        System.out.println("getCompanyName");
        Company instance = null;
        String expResult = "";
        String result = instance.getCompanyName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTeamName method, of class Company.
     */
    @Test
    public void testSetTeamName() {
        System.out.println("setTeamName");
        String companyName = "";
        Company instance = null;
        instance.setTeamName(companyName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeamMembers method, of class Company.
     */
    @Test
    public void testGetTeamMembers() {
        System.out.println("getTeamMembers");
        Company instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getTeamMembers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
