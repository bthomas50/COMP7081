/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.util.Set;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matt
 */
public class ServerTest {
    
    public ServerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of start method, of class Server.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Server instance = null;
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class Server.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        Server instance = null;
        instance.stop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class Server.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        String msg = "";
        Server instance = null;
        instance.display(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of broadcast method, of class Server.
     */
    @Test
    public void testBroadcast() {
        System.out.println("broadcast");
        String message = "";
        Server instance = null;
        instance.broadcast(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of companyBroadcast method, of class Server.
     */
    @Test
    public void testCompanyBroadcast() {
        System.out.println("companyBroadcast");
        String company = "";
        String message = "";
        Server instance = null;
        instance.companyBroadcast(company, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of teamBroadcast method, of class Server.
     */
    @Test
    public void testTeamBroadcast() {
        System.out.println("teamBroadcast");
        String team = "";
        String message = "";
        Server instance = null;
        instance.teamBroadcast(team, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUser method, of class Server.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        User u = null;
        Server instance = null;
        instance.removeUser(u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Server.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Server.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class Server.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        String name = "";
        Server instance = null;
        User expResult = null;
        User result = instance.getUser(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTeam method, of class Server.
     */
    @Test
    public void testAddTeam() {
        System.out.println("addTeam");
        String teamName = "";
        Team newTeam = null;
        Server instance = null;
        instance.addTeam(teamName, newTeam);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeam method, of class Server.
     */
    @Test
    public void testGetTeam() {
        System.out.println("getTeam");
        String teamName = "";
        Server instance = null;
        Team expResult = null;
        Team result = instance.getTeam(teamName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllUsers method, of class Server.
     */
    @Test
    public void testGetAllUsers() {
        System.out.println("getAllUsers");
        Server instance = null;
        Set expResult = null;
        Set result = instance.getAllUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTeam method, of class Server.
     */
    @Test
    public void testRemoveTeam() {
        System.out.println("removeTeam");
        Team t = null;
        Server instance = null;
        instance.removeTeam(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class Server.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        User loggedInUser = null;
        Server instance = null;
        instance.addUser(loggedInUser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCompany method, of class Server.
     */
    @Test
    public void testAddCompany() {
        System.out.println("addCompany");
        Company existingCompany = null;
        Server instance = null;
        instance.addCompany(existingCompany);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompany method, of class Server.
     */
    @Test
    public void testGetCompany() {
        System.out.println("getCompany");
        String companyName = "";
        Server instance = null;
        Company expResult = null;
        Company result = instance.getCompany(companyName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
