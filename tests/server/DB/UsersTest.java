/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.DB;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assume.*;
import server.DB.Users.PwdResult;
import server.UserData;

/**
 *
 * @author Matt, Brian
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
//        try(Connection conn = DB.connect())
//        {
//            for(int i = 0; i < 3; i++)
//            {
//                PwdResult expResult = PwdResult.SUCCESS;
//                PwdResult result = Users.getPassword(conn, DBSuite.USERNAMES[i], DBSuite.PASSWORDS[i]);
//                assertEquals(expResult, result);
//                expResult = PwdResult.INCORRECT_PASSWORD;
//                result = Users.getPassword(conn, DBSuite.USERNAMES[i], DBSuite.PASSWORDS[i] + "blahblah");
//                assertEquals(expResult, result);
//                expResult = PwdResult.NO_SUCH_USER;
//                result = Users.getPassword(conn, DBSuite.USERNAMES[i] + "blahblah", DBSuite.PASSWORDS[i]);
//                assertEquals(expResult, result);
//            }
//        }
    }

    /**
     * Test of getTeam method, of class Users.
     */
    @Test
    public void testGetTeam() throws Exception {
        System.out.println("getTeam");
//        try(Connection conn = DB.connect())
//        {
//            for(int i = 0; i < 3; i++)
//            {
//                String expResult = DBSuite.TEAMS[i];
//                String result = Users.getTeam(conn, DBSuite.USERNAMES[i]);
//                assertEquals(expResult, result);
//            }
//        }
    }

    /**
     * Test of getRole method, of class Users.
     */
    @Test
    public void testGetRole() throws Exception {
        System.out.println("getRole");
//        try(Connection conn = DB.connect())
//        {
//            for(int i = 0; i < 3; i++)
//            {
//                String expResult = DBSuite.ROLES[i];
//                String result = Users.getRole(conn, DBSuite.USERNAMES[i]);
//                assertEquals(expResult, result);
//            }
//        }
    }

    /**
     * Test of setRole method, of class Users.
     */
    @Test
    public void testSetRole() throws Exception {
        System.out.println("setRole");
//        try(Connection conn = DB.connect())
//        {
//            for(int i = 0; i < 3; i++)
//            {
//                String expResult = DBSuite.ROLES[i] + "blahblah";
//                Users.setRole(conn, DBSuite.USERNAMES[i], expResult);
//                String result = Users.getRole(conn, DBSuite.USERNAMES[i]);
//                assertEquals(expResult, result);
//                Users.setRole(conn, DBSuite.USERNAMES[i], DBSuite.ROLES[i]);
//            }
//        }
    }

    /**
     * Test of addUser method, of class Users.
     */
    @Test
    public void testAddUser() throws Exception {
        System.out.println("addUser");
//        try(Connection conn = DB.connect())
//        {
//            String username = "TESTUSER4";
//            String passHash = "TESTPASSWORD4";
//            String role = "";
//            String team = "";
//            Users.addUser(conn, username, passHash, role, team);
//            Users.getDummyUserData(conn, username);
//            //adding duplicate user
//            try
//            {
//                Users.addUser(conn, username, passHash, role, team);
//                fail("successfully added duplicate user");
//            }
//            catch(SQLException slqe)
//            { }
//            Users.removeUser(conn, username);
//        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeUser method, of class Users.
     */
    @Test
    public void testRemoveUser() throws Exception {
        System.out.println("removeUser");
//        try(Connection conn = DB.connect())
//        {
//            for(int i = 0; i < 3; i++)
//            {
//                Users.removeUser(conn, DBSuite.USERNAMES[i]);
//                try
//                {
//                    Users.getDummyUserData(conn, DBSuite.USERNAMES[i]);
//                    fail("user not removed");
//                }
//                catch(SQLException sqle)
//                {}
//                try
//                {
//                    Users.removeUser(conn, DBSuite.USERNAMES[i]);
//                    fail("should throw when removing non-existent user.");
//                }
//                catch(SQLException sqle)
//                {}
//                try
//                {
//                    Users.addUser(conn, DBSuite.USERNAMES[i], DBSuite.PASSWORDS[i], DBSuite.ROLES[i], DBSuite.TEAMS[i]);
//                }
//                catch(SQLException sqle)
//                {
//                    assumeNoException(sqle);
//                }
//            }
//        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTeam method, of class Users.
     */
    @Test
    public void testSetTeam() throws Exception {
        System.out.println("setTeam");
//        try(Connection conn = DB.connect())
//        {
//            for(int i = 0; i < 3; i++)
//            {
//                String expResult = DBSuite.TEAMS[(i + 1) % 3];
//                Users.setTeam(conn, DBSuite.USERNAMES[i], expResult);
//                try
//                {
//                    String result = Users.getTeam(conn, DBSuite.USERNAMES[i]);
//                    assertEquals(expResult, result);
//                }
//                catch(SQLException e)
//                {
//                    assumeNoException(e);
//                }
//                Users.setTeam(conn, DBSuite.USERNAMES[i], DBSuite.TEAMS[i]);
//            }
//            try
//            {
//                Users.setTeam(conn, "NOTAUSER", DBSuite.TEAMS[0]);
//                fail("should throw for non-existent user");
//            }
//            catch(SQLException sqle)
//            {}
//            try
//            {
//                Users.setTeam(conn, DBSuite.USERNAMES[0], "NOTATEAM");
//                fail("should throw for non-existent team");
//            }
//            catch(SQLException sqle)
//            {}
//        }
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDummyUserData method, of class Users.
     */
    @Test
    public void testGetDummyUserData() throws Exception {
        System.out.println("getDummyUserData");
        
//        try(Connection conn = DB.connect())
//        {
//            for(int i = 0; i < 3; i++)
//            {
//                UserData expResult = UserData.createDummyUserData(DBSuite.USERNAMES[i], DBSuite.PASSWORDS[i], DBSuite.ROLES[i], DBSuite.TEAMS[i]);
//                UserData result = Users.getDummyUserData(conn, DBSuite.USERNAMES[i]);
//                assertEquals(expResult.getUserID(), result.getUserID());
//                assertEquals(expResult.getPassword(), result.getPassword());
//                assertEquals(expResult.getTeam(), result.getTeam());
//            }
//        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
