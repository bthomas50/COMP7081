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
import server.DB.Users.PwdResult;
import server.UserData;

/**
 *
 * @author Matt
 */
public class UsersTest {
    
    public UsersTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getPassword method, of class Users.
     */
    @Test
    public void testGetPassword() throws Exception {
        System.out.println("getPassword");
        Connection conn = null;
        String username = "";
        String passHash = "";
        PwdResult expResult = null;
        PwdResult result = Users.getPassword(conn, username, passHash);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeam method, of class Users.
     */
    @Test
    public void testGetTeam() throws Exception {
        System.out.println("getTeam");
        Connection conn = null;
        String username = "";
        String expResult = "";
        String result = Users.getTeam(conn, username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRole method, of class Users.
     */
    @Test
    public void testGetRole() throws Exception {
        System.out.println("getRole");
        Connection conn = null;
        String username = "";
        String expResult = "";
        String result = Users.getRole(conn, username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRole method, of class Users.
     */
    @Test
    public void testSetRole() throws Exception {
        System.out.println("setRole");
        Connection conn = null;
        String username = "";
        String role = "";
        Users.setRole(conn, username, role);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class Users.
     */
    @Test
    public void testAddUser() throws Exception {
        System.out.println("addUser");
        Connection conn = null;
        String username = "";
        String passHash = "";
        String role = "";
        String team = "";
        Users.addUser(conn, username, passHash, role, team);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUser method, of class Users.
     */
    @Test
    public void testRemoveUser() throws Exception {
        System.out.println("removeUser");
        Connection conn = null;
        String username = "";
        Users.removeUser(conn, username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTeam method, of class Users.
     */
    @Test
    public void testSetTeam() throws Exception {
        System.out.println("setTeam");
        Connection conn = null;
        String username = "";
        String newTeam = "";
        Users.setTeam(conn, username, newTeam);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDummyUserData method, of class Users.
     */
    @Test
    public void testGetDummyUserData() throws Exception {
        System.out.println("getDummyUserData");
        Connection conn = null;
        String username = "";
        UserData expResult = null;
        UserData result = Users.getDummyUserData(conn, username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
