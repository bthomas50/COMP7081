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
public class ScrumMasterRoleTest {
    
    public ScrumMasterRoleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of canTeamChat method, of class ScrumMasterRole.
     */
    @Test
    public void testCanTeamChat() {
        System.out.println("canTeamChat");
        String teamName = "";
        ScrumMasterRole instance = null;
        boolean expResult = false;
        boolean result = instance.canTeamChat(teamName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canAllChat method, of class ScrumMasterRole.
     */
    @Test
    public void testCanAllChat() {
        System.out.println("canAllChat");
        ScrumMasterRole instance = null;
        boolean expResult = false;
        boolean result = instance.canAllChat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ScrumMasterRole.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ScrumMasterRole instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class ScrumMasterRole.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Role other = null;
        ScrumMasterRole instance = null;
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnum method, of class ScrumMasterRole.
     */
    @Test
    public void testGetEnum() {
        System.out.println("getEnum");
        ScrumMasterRole instance = null;
        int expResult = 0;
        int result = instance.getEnum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canAddUser method, of class ScrumMasterRole.
     */
    @Test
    public void testCanAddUser() {
        System.out.println("canAddUser");
        UserData ud = null;
        ScrumMasterRole instance = null;
        boolean expResult = false;
        boolean result = instance.canAddUser(ud);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canRemoveUser method, of class ScrumMasterRole.
     */
    @Test
    public void testCanRemoveUser() {
        System.out.println("canRemoveUser");
        UserData ud = null;
        ScrumMasterRole instance = null;
        boolean expResult = false;
        boolean result = instance.canRemoveUser(ud);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canChangeRole method, of class ScrumMasterRole.
     */
    @Test
    public void testCanChangeRole() {
        System.out.println("canChangeRole");
        UserData oldUD = null;
        UserData newUD = null;
        ScrumMasterRole instance = null;
        boolean expResult = false;
        boolean result = instance.canChangeRole(oldUD, newUD);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canSetTeam method, of class ScrumMasterRole.
     */
    @Test
    public void testCanSetTeam() {
        System.out.println("canSetTeam");
        UserData oldUD = null;
        UserData newUD = null;
        ScrumMasterRole instance = null;
        boolean expResult = false;
        boolean result = instance.canSetTeam(oldUD, newUD);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canSetCompany method, of class ScrumMasterRole.
     */
    @Test
    public void testCanSetCompany() {
        System.out.println("canSetCompany");
        TeamData oldTD = null;
        TeamData newTD = null;
        ScrumMasterRole instance = null;
        boolean expResult = false;
        boolean result = instance.canSetCompany(oldTD, newTD);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
