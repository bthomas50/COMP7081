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
public class ScrumMasterRoleTest {

    private User u, user, admin, developer, scrum, anon;

    public ScrumMasterRoleTest() {
        u = new User("tester", "password", "master", "testTeam", (BufferedReader) null, new PrintWriter(System.out), (Server) null);
        admin = new User("tester", "password", "admin", "testTeam", (BufferedReader) null, new PrintWriter(System.out), (Server) null);
        developer = new User("tester", "password", "dev", "testTeam", (BufferedReader) null, new PrintWriter(System.out), (Server) null);
        scrum = new User("tester", "password", "master", "testTeam", (BufferedReader) null, new PrintWriter(System.out), (Server) null);
        anon = new User("tester", "password", "anon", "testTeam", (BufferedReader) null, new PrintWriter(System.out), (Server) null);   
        user = new User("tester", "password", "user", "testTeam", (BufferedReader) null, new PrintWriter(System.out), (Server) null);
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
        String teamName = "testTeam";
        ScrumMasterRole instance = new ScrumMasterRole(u);
        boolean expResult = true;
        boolean result = instance.canTeamChat(teamName);
        assertEquals(expResult, result);
    }

    /**
     * Test of canAllChat method, of class ScrumMasterRole.
     */
    @Test
    public void testCanAllChat() {
        System.out.println("canAllChat");
        ScrumMasterRole instance = new ScrumMasterRole(u);
        boolean expResult = true;
        boolean result = instance.canAllChat();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class ScrumMasterRole.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ScrumMasterRole instance = new ScrumMasterRole(u);;
        String expResult = Role.SCRUM_MASTER;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class ScrumMasterRole.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        ScrumMasterRole instance = new ScrumMasterRole(u);
        
        Role other = admin.getRole();
        int expResult = instance.getEnum() - other.getEnum();
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
        
        other = user.getRole();
        expResult = instance.getEnum() - other.getEnum();
        result = instance.compareTo(other);
        assertEquals(expResult, result);
        
        other = developer.getRole();
        expResult = instance.getEnum() - other.getEnum();
        result = instance.compareTo(other);
        assertEquals(expResult, result);
        
        other = scrum.getRole();
        expResult = instance.getEnum() - other.getEnum();
        result = instance.compareTo(other);
        assertEquals(expResult, result);
        
        other = anon.getRole();
        expResult = instance.getEnum() - other.getEnum();
        result = instance.compareTo(other);
        assertEquals(expResult, result);
    }

    /**
     * Test of getEnum method, of class ScrumMasterRole.
     */
    @Test
    public void testGetEnum() {
        System.out.println("getEnum");
        ScrumMasterRole instance = new ScrumMasterRole(u);
        int expResult = Role.E_MASTER;
        int result = instance.getEnum();
        assertEquals(expResult, result);
    }

    /**
     * Test of canAddUser method, of class ScrumMasterRole.
     */
    @Test
    public void testCanAddUser() {
        System.out.println("canAddUser");
        ScrumMasterRole instance = new ScrumMasterRole(u);
        
        UserData ud = new UserData("testUD", "passUD", new DevRole(developer), "testTeam");
        boolean expResult = true;
        boolean result = instance.canAddUser(ud);
        assertEquals(expResult, result);
        
        ud = new UserData("testUD", "passUD", new ScrumMasterRole(scrum), "testTeam");
        expResult = false;
        result = instance.canAddUser(ud);
        assertEquals(expResult, result);
        
        ud = new UserData("testUD", "passUD", new UserRole(user), "testTeam");
        expResult = true;
        result = instance.canAddUser(ud);
        assertEquals(expResult, result);
        
        ud = new UserData("testUD", "passUD", new AnonRole(), "testTeam");
        expResult = true;
        result = instance.canAddUser(ud);
        assertEquals(expResult, result);
        
        ud = new UserData("testUD", "passUD", new AdminRole(), "testTeam");
        expResult = false;
        result = instance.canAddUser(ud);
        assertEquals(expResult, result);
    }

    /**
     * Test of canRemoveUser method, of class ScrumMasterRole.
     */
    @Test
    public void testCanRemoveUser() {
        System.out.println("canRemoveUser");
        ScrumMasterRole instance = new ScrumMasterRole(u);
        
        UserData ud = new UserData("testUD", "passUD", new DevRole(developer), "testTeam");
        boolean expResult = true;
        boolean result = instance.canRemoveUser(ud);
        assertEquals(expResult, result);
        
        ud = new UserData("testUD", "passUD", new ScrumMasterRole(scrum), "testTeam");
        expResult = false;
        result = instance.canRemoveUser(ud);
        assertEquals(expResult, result);
        
        ud = new UserData("testUD", "passUD", new UserRole(user), "testTeam");
        expResult = true;
        result = instance.canRemoveUser(ud);
        assertEquals(expResult, result);
        
        ud = new UserData("testUD", "passUD", new AnonRole(), "testTeam");
        expResult = true;
        result = instance.canRemoveUser(ud);
        assertEquals(expResult, result);
        
        ud = new UserData("testUD", "passUD", new AdminRole(), "testTeam");
        expResult = false;
        result = instance.canRemoveUser(ud);
        assertEquals(expResult, result);
    }

    /**
     * Test of canChangeRole method, of class ScrumMasterRole.
     */
    @Test
    public void testCanChangeRole() {
        System.out.println("canChangeRole");
        UserData oldUD = new UserData("1", "2", new DevRole(developer), "testTeam");
        UserData newUD = new UserData("n1", "n2", new UserRole(developer), "testTeam");
        ScrumMasterRole instance = new ScrumMasterRole(u);
        
        boolean expResult = true;
        boolean result = instance.canChangeRole(oldUD, newUD);
        assertEquals(expResult, result);
        
        newUD = new UserData("1", "2", new DevRole(developer), "testTeam");
        expResult = true;
        result = instance.canChangeRole(oldUD, newUD);
        assertEquals(expResult, result);
        
        newUD = new UserData("1", "2", new ScrumMasterRole(developer), "testTeam");
        expResult = false;
        result = instance.canChangeRole(oldUD, newUD);
        assertEquals(expResult, result);
        
        oldUD = new UserData("1", "2", new DevRole(developer), "testTeam2");
        newUD = new UserData("1", "2", new UserRole(developer), "testTeam2");
        expResult = false;
        result = instance.canChangeRole(oldUD, newUD);
        assertEquals(expResult, result);
    }

    /**
     * Test of canSetTeam method, of class ScrumMasterRole.
     */
    @Test
    public void testCanSetTeam() {
        System.out.println("canSetTeam");
        UserData oldUD = new UserData("1", "2", new DevRole(developer), "");
        UserData newUD = new UserData("1", "2", new DevRole(developer), "testTeam");
        ScrumMasterRole instance = new ScrumMasterRole(u);
        
        boolean expResult = true;
        boolean result = instance.canSetTeam(oldUD, newUD);
        assertEquals(expResult, result);
        
        
        expResult = true;
        result = instance.canSetTeam(newUD, oldUD);
        assertEquals(expResult, result);
        
        newUD = new UserData("1", "2", new DevRole(developer), "testTeam2");
        expResult = false;
        result = instance.canSetTeam(oldUD, newUD);
        assertEquals(expResult, result);
        
        newUD = new UserData("1", "2", new DevRole(developer), "testTeam2");
        expResult = false;
        result = instance.canSetTeam(newUD, oldUD);
        assertEquals(expResult, result);
    }

    /**
     * Test of canSetCompany method, of class ScrumMasterRole.
     */
    @Test
    public void testCanSetCompany() {
        System.out.println("canSetCompany");
        TeamData oldTD = new TeamData("team1", "comp1");
        TeamData newTD = new TeamData("team2", "comp2");
        ScrumMasterRole instance = new ScrumMasterRole(u);
        boolean expResult = false;
        boolean result = instance.canSetCompany(oldTD, newTD);
        assertEquals(expResult, result);
    }
}
