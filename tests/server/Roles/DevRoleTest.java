/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.Roles;

import java.io.BufferedReader;
import java.io.PrintWriter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import server.Server;
import server.TeamData;
import server.User;
import server.UserData;

/**
 *
 * @author Matt
 */
public class DevRoleTest {
    
    private User u;
    
    public DevRoleTest() {
        u = new User("tester"
                , "password"
                , "dev"
                , "testTeam"
                , (BufferedReader)null
                , (PrintWriter)null
                , (Server)null);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of canTeamChat method, of class DevRole.
     */
    @Test
    public void testCanTeamChat() {
        System.out.println("canTeamChat");
        String teamName = "testTeam";
        DevRole instance = new DevRole(u);
        boolean expResult = true;
        boolean result = instance.canTeamChat(teamName);
        assertEquals(expResult, result);
        
        teamName = "falseTest";
        expResult = false;
        result = instance.canTeamChat(teamName);
        assertEquals(expResult, result);
    }

    /**
     * Test of canAllChat method, of class DevRole.
     */
    @Test
    public void testCanAllChat() {
        System.out.println("canAllChat");
        DevRole instance = new DevRole(u);
        boolean expResult = true;
        boolean result = instance.canAllChat();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class DevRole.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DevRole instance = new DevRole(u);
        String expResult = Role.DEVELOPER;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEnum method, of class DevRole.
     */
    @Test
    public void testGetEnum() {
        System.out.println("getEnum");
        DevRole instance = new DevRole(u);
        int expResult = Role.E_DEV;
        int result = instance.getEnum();
        assertEquals(expResult, result);
    }

    /**
     * Test of canAddUser method, of class DevRole.
     */
    @Test
    public void testCanAddUser() {
        System.out.println("canAddUser");
        UserData ud = null;
        DevRole instance = new DevRole(u);
        boolean expResult = false;
        boolean result = instance.canAddUser(ud);
        assertEquals(expResult, result);
    }

    /**
     * Test of canRemoveUser method, of class DevRole.
     */
    @Test
    public void testCanRemoveUser() {
        System.out.println("canRemoveUser");
        UserData ud = null;
        DevRole instance = new DevRole(u);
        boolean expResult = false;
        boolean result = instance.canRemoveUser(ud);
        assertEquals(expResult, result);
    }

    /**
     * Test of canChangeRole method, of class DevRole.
     */
    @Test
    public void testCanChangeRole() {
        System.out.println("canChangeRole");
        UserData oldUD = null;
        UserData newUD = null;
        DevRole instance = new DevRole(u);
        boolean expResult = false;
        boolean result = instance.canChangeRole(oldUD, newUD);
        assertEquals(expResult, result);
    }

    /**
     * Test of canSetTeam method, of class DevRole.
     */
    @Test
    public void testCanSetTeam() {
        System.out.println("canSetTeam");
        UserData oldUD = null;
        UserData newUD = null;
        DevRole instance = new DevRole(u);
        boolean expResult = false;
        boolean result = instance.canSetTeam(oldUD, newUD);
        assertEquals(expResult, result);
    }

    /**
     * Test of canSetCompany method, of class DevRole.
     */
    @Test
    public void testCanSetCompany() {
        System.out.println("canSetCompany");
        TeamData oldTD = null;
        TeamData newTD = null;
        DevRole instance = new DevRole(u);
        boolean expResult = false;
        boolean result = instance.canSetCompany(oldTD, newTD);
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class DevRole.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        DevRole instance = new DevRole(u);

        Role o = new AdminRole();
        int expResult = Role.E_DEV - Role.E_ADMIN;
        int result = instance.compareTo(o);        
        assertEquals(expResult, result);
        
        o = new AnonRole();
        expResult = Role.E_DEV - Role.E_ANON;
        result = instance.compareTo(o);
        assertEquals(expResult, result);
        
        User a = null;
        o = new UserRole(a);
        expResult = Role.E_DEV - Role.E_USER;
        result = instance.compareTo(o);
        assertEquals(expResult, result);
        
        o = new DevRole(a);
        expResult = Role.E_DEV - Role.E_DEV;
        result = instance.compareTo(o);
        assertEquals(expResult, result);
        
        o = new ScrumMasterRole(a);
        expResult = Role.E_DEV - Role.E_MASTER;
        result = instance.compareTo(o);
        assertEquals(expResult, result);
    }
}
