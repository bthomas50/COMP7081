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
        try
        {
            TEST_STREAM.close();
        }
        catch(IOException e)
        {}
        TEST_PRINTER.close();
    }

    /**
     * Test of getUD method, of class User.
     */
    @Test
    public void testGetUD() {
        System.out.println("getUD");
        for(int i = 0; i < 3; i++)
        {
            UserData expResult = new UserData("TestName" + i, "TestPass" + i, new AnonRole(), "TestTeam" + i);
            UserData result = TEST_USERS[i].getUD();
            if(!testEquality(result, expResult))
            {
                fail("UDs don't match before setting");
            }
            UserData oldData = result;
            expResult.setPassword("blah");
            TEST_USERS[i].setUD(expResult);
            result = TEST_USERS[i].getUD();
            if(!testEquality(result, expResult))
            {
                fail("UDs don't match after setting");
            }
            TEST_USERS[i].setUD(oldData);
        }
    }

    /**
     * Test of setUD method, of class User.
     */
    @Test
    public void testSetUD() {
        System.out.println("setUD");
        for(int i = 0; i < 3; i++)
        {
            UserData expResult = new UserData("TestName" + i, "blah" + i, new AnonRole(), "TestTeam" + i);
            UserData oldData = TEST_USERS[i].getUD();
            TEST_USERS[i].setUD(expResult);
            UserData result = TEST_USERS[i].getUD();
            if(!testEquality(result, expResult))
            {
                fail("UDs don't match after setting");
            }
            TEST_USERS[i].setUD(oldData);
        }
    }

    /**
     * Test of getUserID method, of class User.
     */
    @Test
    public void testGetUserID() {
        System.out.println("getUserID");
        for(int i = 0; i < 3; i++)
        {
            String expResult = "TestName" + i;
            String result = TEST_USERS[i].getUserID();
            assertEquals(result, expResult);
        }
    }

    /**
     * Test of getRole method, of class User.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
        for(int i = 0; i < 3; i++)
        {
            Role result = TEST_USERS[i].getRole();
            assertEquals(result.getEnum(), 0);
            Role expResult = RoleFactory.createRole("Admin", TEST_USERS[i]);
            TEST_USERS[i].setRole(expResult);
            result = TEST_USERS[i].getRole();
            assertEquals(result.getEnum(), expResult.getEnum());
            TEST_USERS[i].setRole(new AnonRole());
        }
    }

    /**
     * Test of getRoleEnum method, of class User.
     */
    @Test
    public void testGetRoleEnum() {
        System.out.println("getRoleEnum");
        for(int i = 0; i < 3; i++)
        {
            int expResult = 0;
            int result = TEST_USERS[i].getRoleEnum();
            assertEquals(expResult, result);
            Role newRole = RoleFactory.createRole("Admin", TEST_USERS[i]);
            TEST_USERS[i].setRole(newRole);
            expResult = newRole.getEnum();
            result = TEST_USERS[i].getRoleEnum();
            assertEquals(result, expResult);
            TEST_USERS[i].setRole(RoleFactory.createRole("Anonymous", TEST_USERS[i]));
        }
    }

    /**
     * Test of getTeamName method, of class User.
     */
    @Test
    public void testGetTeamName() {
        System.out.println("getTeamName");
        for(int i = 0; i < 3; i++)
        {
            String expResult = "TestTeam" + i;
            String result = TEST_USERS[i].getTeamName();
            assertEquals(result, expResult);
        }
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        for(int i = 0; i < 3; i++)
        {
            String expResult = "TestPass" + i;
            String result = TEST_USERS[i].getPassword();
            assertEquals(result, expResult);
        }
    }

    /**
     * Test of sendMessage method, of class User.
     */
    @Test
    public void testSendMessage() {
        System.out.println("sendMessage");
        String message = "test\n";
        for(int i = 0; i < 3; i++)
        {
            TEST_USERS[i].sendMessage(message);
            EXP_STREAM_CONTENTS += message;
            try
            {
                assertEquals(TEST_STREAM.toString("UTF-8"), EXP_STREAM_CONTENTS);
            }
            catch(UnsupportedEncodingException e)
            {
                assumeNoException(e);
            }
        }
    }

    /**
     * Test of getServer method, of class User.
     */
    @Test
    public void testGetServer() {
        System.out.println("getServer");
        for(int i = 0; i < 3; i++)
        {
            assertNull(TEST_USERS[i].getServer());
        }
    }

    private static boolean testEquality(UserData data1, UserData data2)
    {
        if(data1.getRole() == null)
        {
            return (data1.getPassword().equals(data2.getPassword()) &&
                    data2.getRole() == null &&
                    data1.getTeam().equals(data2.getTeam()) &&
                    data1.getUserID().equals(data2.getUserID()));
        }
        return (data1.getPassword().equals(data2.getPassword()) &&
                data1.getRole().getEnum() == data2.getRole().getEnum() &&
                data1.getTeam().equals(data2.getTeam()) &&
                data1.getUserID().equals(data2.getUserID()));
    }
}
