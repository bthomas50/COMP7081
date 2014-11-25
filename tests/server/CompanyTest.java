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

    Team team;
    Company instance;

    public CompanyTest() {
        team = new Team("testTeam");
        instance = new Company("testCompany");
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
        boolean expResult = true;
        boolean result = instance.addTeam(team);
        assertEquals(expResult, result);
    }

    /**
     * Test of containsMember method, of class Company.
     */
    @Test
    public void testContainsMember() {
        System.out.println("containsMember");
        boolean expResult = false;
        boolean result = instance.containsMember(team);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeUser method, of class Company.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        boolean expResult = false;
        boolean result = instance.removeUser(team);
        assertEquals(expResult, result);
    }

    /**
     * Test of getTeamList method, of class Company.
     */
    @Test
    public void testGetTeamList() {
        System.out.println("getTeamList");
        String[] expResult = null;
        String[] result = instance.getTeamList();
        //Should return empty array
        //assertArrayEquals(expResult, result);
    }

    /**
     * Test of getCompanyName method, of class Company.
     */
    @Test
    public void testGetCompanyName() {
        System.out.println("getCompanyName");
        String expResult = "testCompany";
        String result = instance.getCompanyName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTeamName method, of class Company.
     */
    @Test
    public void testSetTeamName() {
        System.out.println("setTeamName");
        //String companyName = "testCompanyName";
        //instance.setTeamName(companyName);
    }

    /**
     * Test of getTeamMembers method, of class Company.
     */
    @Test
    public void testGetTeamMembers() {
        System.out.println("getTeamMembers");
        ArrayList expResult = null;
        ArrayList result = instance.getTeamMembers();
        //assertEquals(expResult, result);
    }
}
