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
public class UserRoleTest {
    
    private User u, user, admin, developer, scrum, anon;
    
    public UserRoleTest() {
        u = new User("tester", "password", "user", "testTeam", (BufferedReader) null, new PrintWriter(System.out), (Server) null);
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
     * Test of canTeamChat method, of class UserRole.
     */
    @Test
    public void testCanTeamChat() {
        System.out.println("canTeamChat");
        String teamName = "testTeam";
        Role instance = u.getRole();
        boolean expResult = true;
        boolean result = instance.canTeamChat(teamName);
        assertEquals(expResult, result);
    }

    /**
     * Test of canAllChat method, of class UserRole.
     */
    @Test
    public void testCanAllChat() {
        System.out.println("canAllChat");
        Role instance = u.getRole();
        boolean expResult = true;
        boolean result = instance.canAllChat();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class UserRole.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Role instance = u.getRole();
        String expResult = Role.USER;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEnum method, of class UserRole.
     */
    @Test
    public void testGetEnum() {
        System.out.println("getEnum");
        Role instance = u.getRole();
        int expResult = Role.E_USER;
        int result = instance.getEnum();
        assertEquals(expResult, result);
    }

    /**
     * Test of canAddUser method, of class UserRole.
     */
    @Test
    public void testCanAddUser() {
        System.out.println("canAddUser");
        UserData ud = new UserData("testUD", "passUD", new AnonRole(), "testTeam");
        Role instance = u.getRole();
        boolean expResult = false;
        boolean result = instance.canAddUser(ud);
        assertEquals(expResult, result);
    }

    /**
     * Test of canRemoveUser method, of class UserRole.
     */
    @Test
    public void testCanRemoveUser() {
        System.out.println("canRemoveUser");
        UserData ud = new UserData("testUD", "passUD", new AnonRole(), "testTeam");
        Role instance = u.getRole();
        boolean expResult = false;
        boolean result = instance.canRemoveUser(ud);
        assertEquals(expResult, result);
    }

    /**
     * Test of canChangeRole method, of class UserRole.
     */
    @Test
    public void testCanChangeRole() {
        System.out.println("canChangeRole");
        UserData oldUD = new UserData("testUD", "passUD", new AnonRole(), "testTeam");
        UserData newUD = new UserData("testUD", "passUD", new DevRole(u), "testTeam");
        Role instance = u.getRole();
        boolean expResult = false;
        boolean result = instance.canChangeRole(oldUD, newUD);
        assertEquals(expResult, result);
    }

    /**
     * Test of canSetTeam method, of class UserRole.
     */
    @Test
    public void testCanSetTeam() {
        System.out.println("canSetTeam");
        UserData oldUD = new UserData("testUD", "passUD", new AnonRole(), "testTeam");
        UserData newUD = new UserData("testUD", "passUD", new AnonRole(), "testTeam2");
        Role instance = u.getRole();
        boolean expResult = false;
        boolean result = instance.canSetTeam(oldUD, newUD);
        assertEquals(expResult, result);
    }

    /**
     * Test of canSetCompany method, of class UserRole.
     */
    @Test
    public void testCanSetCompany() {
        System.out.println("canSetCompany");
        TeamData oldTD = new TeamData("team1", "comp1");
        TeamData newTD = new TeamData("team2", "comp2");
        Role instance = u.getRole();
        
        boolean expResult = false;
        boolean result = instance.canSetCompany(oldTD, newTD);
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class UserRole.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Role instance = u.getRole();
                
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
}
