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
import server.UserData;

/**
 *
 * @author Matt
 */
public class DevRoleTest {
    
    public DevRoleTest() {
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
        String teamName = "";
        DevRole instance = null;
        boolean expResult = false;
        boolean result = instance.canTeamChat(teamName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canAllChat method, of class DevRole.
     */
    @Test
    public void testCanAllChat() {
        System.out.println("canAllChat");
        DevRole instance = null;
        boolean expResult = false;
        boolean result = instance.canAllChat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class DevRole.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DevRole instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnum method, of class DevRole.
     */
    @Test
    public void testGetEnum() {
        System.out.println("getEnum");
        DevRole instance = null;
        int expResult = 0;
        int result = instance.getEnum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canAddUser method, of class DevRole.
     */
    @Test
    public void testCanAddUser() {
        System.out.println("canAddUser");
        UserData ud = null;
        DevRole instance = null;
        boolean expResult = false;
        boolean result = instance.canAddUser(ud);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canRemoveUser method, of class DevRole.
     */
    @Test
    public void testCanRemoveUser() {
        System.out.println("canRemoveUser");
        UserData ud = null;
        DevRole instance = null;
        boolean expResult = false;
        boolean result = instance.canRemoveUser(ud);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canChangeRole method, of class DevRole.
     */
    @Test
    public void testCanChangeRole() {
        System.out.println("canChangeRole");
        UserData oldUD = null;
        UserData newUD = null;
        DevRole instance = null;
        boolean expResult = false;
        boolean result = instance.canChangeRole(oldUD, newUD);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canSetTeam method, of class DevRole.
     */
    @Test
    public void testCanSetTeam() {
        System.out.println("canSetTeam");
        UserData oldUD = null;
        UserData newUD = null;
        DevRole instance = null;
        boolean expResult = false;
        boolean result = instance.canSetTeam(oldUD, newUD);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canSetCompany method, of class DevRole.
     */
    @Test
    public void testCanSetCompany() {
        System.out.println("canSetCompany");
        TeamData oldTD = null;
        TeamData newTD = null;
        DevRole instance = null;
        boolean expResult = false;
        boolean result = instance.canSetCompany(oldTD, newTD);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class DevRole.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Role o = null;
        DevRole instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
