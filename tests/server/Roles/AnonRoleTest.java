/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.Roles;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import server.TeamData;
import server.User;
import server.UserData;

/**
 *
 * @author Matt
 */
public class AnonRoleTest {
    
    public AnonRoleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of canAllChat method, of class AnonRole.
     */
    @Test
    public void testCanAllChat() {
        System.out.println("canAllChat");
        AnonRole instance = new AnonRole();
        boolean expResult = false;
        boolean result = instance.canAllChat();
        assertEquals(expResult, result);
    }

    /**
     * Test of canTeamChat method, of class AnonRole.
     */
    @Test
    public void testCanTeamChat() {
        System.out.println("canTeamChat");
        String team = "";
        AnonRole instance = new AnonRole();
        boolean expResult = true;
        boolean result = instance.canTeamChat(team);
        assertEquals(expResult, result);
    }

    /**
     * Test of getEnum method, of class AnonRole.
     */
    @Test
    public void testGetEnum() {
        System.out.println("getEnum");
        AnonRole instance = new AnonRole();
        int expResult = Role.E_ANON;
        int result = instance.getEnum();
        assertEquals(expResult, result);
    }

    /**
     * Test of canAddUser method, of class AnonRole.
     */
    @Test
    public void testCanAddUser() {
        System.out.println("canAddUser");
        UserData ud = null;
        AnonRole instance = new AnonRole();
        boolean expResult = false;
        boolean result = instance.canAddUser(ud);
        assertEquals(expResult, result);
    }

    /**
     * Test of canRemoveUser method, of class AnonRole.
     */
    @Test
    public void testCanRemoveUser() {
        System.out.println("canRemoveUser");
        UserData ud = null;
        AnonRole instance = new AnonRole();
        boolean expResult = false;
        boolean result = instance.canRemoveUser(ud);
        assertEquals(expResult, result);
    }

    /**
     * Test of canChangeRole method, of class AnonRole.
     */
    @Test
    public void testCanChangeRole() {
        System.out.println("canChangeRole");
        UserData oldUD = null;
        UserData newUD = null;
        AnonRole instance = new AnonRole();
        boolean expResult = false;
        boolean result = instance.canChangeRole(oldUD, newUD);
        assertEquals(expResult, result);
    }

    /**
     * Test of canSetTeam method, of class AnonRole.
     */
    @Test
    public void testCanSetTeam() {
        System.out.println("canSetTeam");
        UserData oldUD = null;
        UserData newUD = null;
        AnonRole instance = new AnonRole();
        boolean expResult = false;
        boolean result = instance.canSetTeam(oldUD, newUD);
        assertEquals(expResult, result);
    }

    /**
     * Test of canSetCompany method, of class AnonRole.
     */
    @Test
    public void testCanSetCompany() {
        System.out.println("canSetCompany");
        TeamData oldTD = null;
        TeamData newTD = null;
        AnonRole instance = new AnonRole();
        boolean expResult = false;
        boolean result = instance.canSetCompany(oldTD, newTD);
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class AnonRole.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        AnonRole instance = new AnonRole();

        Role o = new AdminRole();
        int expResult = Role.E_ANON - Role.E_ADMIN;
        int result = instance.compareTo(o);        
        assertEquals(expResult, result);
        System.out.println(Role.E_ANON - Role.E_ADMIN);
        
        o = new AnonRole();
        expResult = Role.E_ANON - Role.E_ANON;
        result = instance.compareTo(o);
        assertEquals(expResult, result);
        System.out.println(Role.E_ANON - Role.E_ANON);
        
        User u = null;
        o = new UserRole(u);
        expResult = Role.E_ANON - Role.E_USER;
        result = instance.compareTo(o);
        assertEquals(expResult, result);
        System.out.println(Role.E_ANON - Role.E_USER);
        
        o = new DevRole(u);
        expResult = Role.E_ANON - Role.E_DEV;
        result = instance.compareTo(o);
        assertEquals(expResult, result);
        System.out.println(Role.E_ANON - Role.E_DEV);
        
        o = new ScrumMasterRole(u);
        expResult = Role.E_ANON - Role.E_MASTER;
        result = instance.compareTo(o);
        assertEquals(expResult, result);
        System.out.println(Role.E_ANON - Role.E_MASTER);
    }
}
