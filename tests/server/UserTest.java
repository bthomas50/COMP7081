/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assume.*;
import server.Roles.AnonRole;
import server.Roles.Role;
import server.Roles.RoleFactory;

/**
 *
 * @author Matt
 */
public class UserTest {
    
    public UserTest() {
    }
    private static User[] TEST_USERS;
    private static ByteArrayOutputStream TEST_STREAM;
    private static PrintStream TEST_PRINTER;
    private static String EXP_STREAM_CONTENTS = "";
    @BeforeClass
    public static void setUpClass() {
        TEST_USERS = new User[3];
        TEST_STREAM = new ByteArrayOutputStream(1024);
        TEST_PRINTER = new PrintStream(TEST_STREAM);
        for(int i = 0; i < 3; i++)
        {
            TEST_USERS[i] = new User("TestName" + i, 
                                     "TestPass" + i, 
                                     "Anonymous",
                                     "TestTeam" + i, 
                                     new BufferedReader(new InputStreamReader(System.in)), 
                                     new PrintWriter(TEST_PRINTER), 
                                     null);
            EXP_STREAM_CONTENTS += "You are connected as " + "TestName" + i + "\n";
        }
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getUserThread method, of class User.
     */
    @Test
    public void testGetUserThread() {
        System.out.println("getUserThread");
//        User instance = null;
//        UserCallable expResult = null;
//        UserCallable result = instance.getUserThread();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getUD method, of class User.
     */
    @Test
    public void testGetUD() {
        System.out.println("getUD");
//        User instance = null;
//        UserData expResult = null;
//        UserData result = instance.getUD();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setUD method, of class User.
     */
    @Test
    public void testSetUD() {
        System.out.println("setUD");
//        UserData userData = null;
//        User instance = null;
//        instance.setUD(userData);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of closeUserThread method, of class User.
     */
    @Test
    public void testCloseUserThread() {
        System.out.println("closeUserThread");
//        User instance = null;
//        instance.closeUserThread();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserID method, of class User.
     */
    @Test
    public void testGetUserID() {
        System.out.println("getUserID");
//        User instance = null;
//        String expResult = "";
//        String result = instance.getUserID();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getRole method, of class User.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
//        User instance = null;
//        Role expResult = null;
//        Role result = instance.getRole();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoleEnum method, of class User.
     */
    @Test
    public void testGetRoleEnum() {
        System.out.println("getRoleEnum");
//        User instance = null;
//        int expResult = 0;
//        int result = instance.getRoleEnum();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setRole method, of class User.
     */
    @Test
    public void testSetRole() {
        System.out.println("setRole");
//        Role r = null;
//        User instance = null;
//        instance.setRole(r);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeamName method, of class User.
     */
    @Test
    public void testGetTeamName() {
        System.out.println("getTeamName");
//        User instance = null;
//        String expResult = "";
//        String result = instance.getTeamName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTeamName method, of class User.
     */
    @Test
    public void testSetTeamName() {
        System.out.println("setTeamName");
//        String teamName = "";
//        User instance = null;
//        instance.setTeamName(teamName);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
//        User instance = null;
//        String expResult = "";
//        String result = instance.getPassword();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessage method, of class User.
     */
    @Test
    public void testSendMessage() {
        System.out.println("sendMessage");
//        String message = "";
//        User instance = null;
//        boolean expResult = false;
//        boolean result = instance.sendMessage(message);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getServer method, of class User.
     */
    @Test
    public void testGetServer() {
        System.out.println("getServer");
//        User instance = null;
//        Server expResult = null;
//        Server result = instance.getServer();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompany method, of class User.
     */
    @Test
    public void testGetCompany() {
        System.out.println("getCompany");
//        User instance = null;
//        String expResult = "";
//        String result = instance.getCompany();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
