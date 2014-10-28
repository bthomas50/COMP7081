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
public class RoleTest {
    
    public RoleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of toString method, of class Role.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Role instance = new RoleImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnum method, of class Role.
     */
    @Test
    public void testGetEnum() {
        System.out.println("getEnum");
        Role instance = new RoleImpl();
        int expResult = 0;
        int result = instance.getEnum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canTeamChat method, of class Role.
     */
    @Test
    public void testCanTeamChat() {
        System.out.println("canTeamChat");
        String teamName = "";
        Role instance = new RoleImpl();
        boolean expResult = false;
        boolean result = instance.canTeamChat(teamName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canAllChat method, of class Role.
     */
    @Test
    public void testCanAllChat() {
        System.out.println("canAllChat");
        Role instance = new RoleImpl();
        boolean expResult = false;
        boolean result = instance.canAllChat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canAddUser method, of class Role.
     */
    @Test
    public void testCanAddUser() {
        System.out.println("canAddUser");
        UserData ud = null;
        Role instance = new RoleImpl();
        boolean expResult = false;
        boolean result = instance.canAddUser(ud);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canRemoveUser method, of class Role.
     */
    @Test
    public void testCanRemoveUser() {
        System.out.println("canRemoveUser");
        UserData ud = null;
        Role instance = new RoleImpl();
        boolean expResult = false;
        boolean result = instance.canRemoveUser(ud);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canChangeRole method, of class Role.
     */
    @Test
    public void testCanChangeRole() {
        System.out.println("canChangeRole");
        UserData oldUD = null;
        UserData newUD = null;
        Role instance = new RoleImpl();
        boolean expResult = false;
        boolean result = instance.canChangeRole(oldUD, newUD);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canSetTeam method, of class Role.
     */
    @Test
    public void testCanSetTeam() {
        System.out.println("canSetTeam");
        UserData oldUD = null;
        UserData newUD = null;
        Role instance = new RoleImpl();
        boolean expResult = false;
        boolean result = instance.canSetTeam(oldUD, newUD);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canSetCompany method, of class Role.
     */
    @Test
    public void testCanSetCompany() {
        System.out.println("canSetCompany");
        TeamData oldTD = null;
        TeamData newTD = null;
        Role instance = new RoleImpl();
        boolean expResult = false;
        boolean result = instance.canSetCompany(oldTD, newTD);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RoleImpl implements Role {

        public String toString() {
            return "";
        }

        public int getEnum() {
            return 0;
        }

        public boolean canTeamChat(String teamName) {
            return false;
        }

        public boolean canAllChat() {
            return false;
        }

        public boolean canAddUser(UserData ud) {
            return false;
        }

        public boolean canRemoveUser(UserData ud) {
            return false;
        }

        public boolean canChangeRole(UserData oldUD, UserData newUD) {
            return false;
        }

        public boolean canSetTeam(UserData oldUD, UserData newUD) {
            return false;
        }

        public boolean canSetCompany(TeamData oldTD, TeamData newTD) {
            return false;
        }

        @Override
        public int compareTo(Role o) {
            return -1;
        }
    }
}
