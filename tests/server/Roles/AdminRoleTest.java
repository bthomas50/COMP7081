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
public class AdminRoleTest {
    
    public AdminRoleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of canAllChat method, of class AdminRole.
     */
    @Test
    public void testCanAllChat() {
        System.out.println("canAllChat");
        AdminRole instance = new AdminRole();
        boolean expResult = false;
        boolean result = instance.canAllChat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AdminRole.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AdminRole instance = new AdminRole();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class AdminRole.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Role o = null;
        AdminRole instance = new AdminRole();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnum method, of class AdminRole.
     */
    @Test
    public void testGetEnum() {
        System.out.println("getEnum");
        AdminRole instance = new AdminRole();
        int expResult = 0;
        int result = instance.getEnum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canAddUser method, of class AdminRole.
     */
    @Test
    public void testCanAddUser() {
        System.out.println("canAddUser");
        UserData ud = null;
        AdminRole instance = new AdminRole();
        boolean expResult = false;
        boolean result = instance.canAddUser(ud);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canRemoveUser method, of class AdminRole.
     */
    @Test
    public void testCanRemoveUser() {
        System.out.println("canRemoveUser");
        UserData ud = null;
        AdminRole instance = new AdminRole();
        boolean expResult = false;
        boolean result = instance.canRemoveUser(ud);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canChangeRole method, of class AdminRole.
     */
    @Test
    public void testCanChangeRole() {
        System.out.println("canChangeRole");
        UserData oldUD = null;
        UserData newUD = null;
        AdminRole instance = new AdminRole();
        boolean expResult = false;
        boolean result = instance.canChangeRole(oldUD, newUD);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canTeamChat method, of class AdminRole.
     */
    @Test
    public void testCanTeamChat() {
        System.out.println("canTeamChat");
        String teamName = "";
        AdminRole instance = new AdminRole();
        boolean expResult = false;
        boolean result = instance.canTeamChat(teamName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canSetTeam method, of class AdminRole.
     */
    @Test
    public void testCanSetTeam() {
        System.out.println("canSetTeam");
        UserData oldUD = null;
        UserData newUD = null;
        AdminRole instance = new AdminRole();
        boolean expResult = false;
        boolean result = instance.canSetTeam(oldUD, newUD);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canSetCompany method, of class AdminRole.
     */
    @Test
    public void testCanSetCompany() {
        System.out.println("canSetCompany");
        TeamData oldTD = null;
        TeamData newTD = null;
        AdminRole instance = new AdminRole();
        boolean expResult = false;
        boolean result = instance.canSetCompany(oldTD, newTD);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
