/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import server.Roles.Role;
import server.Roles.RoleFactory;

/**
 *
 * @author Matt
 */
public class UserDataTest {
    
    public UserDataTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createDummyUserData method, of class UserData.
     */
    @Test
    public void testCreateDummyUserData() {
        System.out.println("createDummyUserData");
        String userID = "blah";
        String passHash = "blah2";
        String roleName = "blah4";
        String teamName = "blah9";
        UserData expResult = new UserData(userID, passHash, RoleFactory.createRole(roleName, null), teamName);
        UserData result = UserData.createDummyUserData(userID, passHash, roleName, teamName);
        if(!testEquality(expResult, result))
        {
            fail("UD don't match");
        }
    }

    /**
     * Test of getUserID method, of class UserData.
     */
    @Test
    public void testGetUserID() {
        System.out.println("getUserID");
        String expResult = "blahblah";
        UserData instance = new UserData(expResult, "1234", null, "4321");
        String result = instance.getUserID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUserID method, of class UserData.
     */
    @Test
    public void testSetUserID() {
        System.out.println("setUserID");
        String expResult = "blahblah";
        UserData instance = new UserData(expResult, "qwer", null, "rewq");
        expResult = "blah33343t1";
        instance.setUserID(expResult);
        String result = instance.getUserID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPassword method, of class UserData.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String expResult = "blahblah";
        UserData instance = new UserData("jkl;", expResult, null, ";lkj");
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class UserData.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String expResult = "blahblah";
        UserData instance = new UserData("rew", expResult, null, "bgryi");
        expResult = "blah33343t1";
        instance.setPassword(expResult);
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRole method, of class UserData.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
        Role expResult = RoleFactory.createRole("Admin", null);
        UserData instance = new UserData("bfye", "oeugq", expResult, "8h3");
        Role result = instance.getRole();
        assertEquals(expResult.getEnum(), result.getEnum());
    }

    /**
     * Test of setRole method, of class UserData.
     */
    @Test
    public void testSetRole() {
        System.out.println("setRole");
        Role expResult = RoleFactory.createRole("Admin", null);
        UserData instance = new UserData("b3fyif", "gu7r93", expResult, "jg39h");
        expResult = RoleFactory.createRole("Developer", null);
        instance.setRole(expResult);
        Role result = instance.getRole();
        assertEquals(expResult.getEnum(), result.getEnum());
    }

    /**
     * Test of getTeam method, of class UserData.
     */
    @Test
    public void testGetTeam() {
        System.out.println("getTeam");
        String expResult = "qqq";
        UserData instance = new UserData("gno3r8h", "bgy3r8g734gy3o09yh", null, expResult);
        String result = instance.getTeam();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTeam method, of class UserData.
     */
    @Test
    public void testSetTeam() {
        System.out.println("setTeam");
        String expResult = "qqq";
        UserData instance = new UserData("g0", "0g938uh", null, expResult);
        expResult = "asdfghjk";
        instance.setTeam(expResult);
        String result = instance.getTeam();
        assertEquals(expResult, result);
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
