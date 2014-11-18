/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.PrintWriter;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matt
 */
public class TeamTest {
    
    private static Team[] TEST_TEAMS;
    private static User[] TEST_USERS;

    public TeamTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        TEST_TEAMS = new Team[3];
        TEST_USERS = new User[3];
        for(int i = 0; i < 3; i++)
        {
            TEST_TEAMS[i] = new Team("TestName"+i, "TestComp"+i);
            TEST_USERS[i] = new User("User"+i, "", "", "", null, new PrintWriter(System.out), null);
        }
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addUser method, of class Team.
     */
    @Test
    public void testAddUser() {
        System.out.println("add/contains/removeUser");
        Team instance = TEST_TEAMS[0];
        //add non-duplicate
        instance.addUser(TEST_USERS[0]);
        //add duplicate
        instance.addUser(TEST_USERS[0]);
        //make sure user was added.
        assertTrue(instance.containsMember(TEST_USERS[0]));
        instance.addUser(TEST_USERS[1]);
        assertTrue(instance.containsMember(TEST_USERS[1]));
        instance.removeUser(TEST_USERS[0]);
        assertTrue(instance.containsMember(TEST_USERS[0]));
        instance.removeUser(TEST_USERS[0]);
        instance.removeUser(TEST_USERS[1]);
        assertFalse(instance.containsMember(TEST_USERS[0]));
        assertFalse(instance.containsMember(TEST_USERS[1]));
    }

    /**
     * Test of getTeamList method, of class Team.
     */
    @Test
    public void testGetTeamList() {
        System.out.println("getTeamList");
        Team instance = TEST_TEAMS[1];
        for(int i = 0; i < 3; i++)
        {
            instance.addUser(TEST_USERS[i]);
        }
        String[] expResult = new String[] 
        {
            "User0",
            "User1",
            "User2",
        };
        String[] result = instance.getTeamList();
        assertArrayEquals(expResult, result);
        for(int i = 0; i < 3; i++)
        {
            instance.removeUser(TEST_USERS[i]);
        }
        
        for(int i = 2; i >= 0; i--)
        {
            instance.addUser(TEST_USERS[i]);
        }
        expResult = new String[] 
        {
            "User2",
            "User1",
            "User0",
        };
        result = instance.getTeamList();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of get/setTeamName methods, of class Team.
     */
    @Test
    public void testGetTeamName() {
        System.out.println("get/setTeamName");
        for(int i = 0; i < 3; i++)
        {
            String expResult = "TestName" + i;
            String result = TEST_TEAMS[i].getTeamName();
            assertEquals(expResult, result);
            expResult = "blahblah"+i;
            TEST_TEAMS[i].setTeamName(expResult);
            result = TEST_TEAMS[i].getTeamName();
            assertEquals(expResult, result);
            TEST_TEAMS[i].setTeamName("TestName" + i);
        }
    }

    /**
     * Test of getTeamMembers method, of class Team.
     */
    @Test
    public void testGetTeamMembers() {
        System.out.println("getTeamMembers");
        
        Team instance = TEST_TEAMS[0];
        for(int i = 0; i < 3; i++)
        {
            instance.addUser(TEST_USERS[i]);
        }
        ArrayList result = instance.getTeamMembers();
        for(int i = 0; i < 3; i++)
        {
            assertEquals(TEST_USERS[i], result.get(i));
        }
    }

    /**
     * Test of getCompanyName method, of class Team.
     */
    @Test
    public void testGetCompanyName() {
        System.out.println("getCompanyName");
        for(int i = 0; i < 3; i++)
        {
            String expResult = "TestComp"+i;
            String result = TEST_TEAMS[i].getCompanyName();
            assertEquals(expResult, result);
        }
    }
}
