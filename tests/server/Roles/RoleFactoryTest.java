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
import server.User;

/**
 *
 * @author Matt
 */
public class RoleFactoryTest {
    
    private User user, admin, developer, scrum, anon, abcdefg;
    
    public RoleFactoryTest() {
                user = new User("tester"
                , "password"
                , "user"
                , "testTeam"
                , (BufferedReader)null
                ,  new PrintWriter(System.out)
                , (Server)null);
                
                admin = new User("tester"
                , "password"
                , "admin"
                , "testTeam"
                , (BufferedReader)null
                ,  new PrintWriter(System.out)
                , (Server)null);
                
                developer = new User("tester"
                , "password"
                , "dev"
                , "testTeam"
                , (BufferedReader)null
                ,  new PrintWriter(System.out)
                , (Server)null);
                
                scrum = new User("tester"
                , "password"
                , "master"
                , "testTeam"
                , (BufferedReader)null
                ,  new PrintWriter(System.out)
                , (Server)null);
                
                anon = new User("tester"
                , "password"
                , "anon"
                , "testTeam"
                , (BufferedReader)null
                ,  new PrintWriter(System.out)
                , (Server)null);
                
                abcdefg = new User("tester"
                , "password"
                , "abcdefg"
                , "testTeam"
                , (BufferedReader)null
                ,  new PrintWriter(System.out)
                , (Server)null);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createRole method, of class RoleFactory.
     */
    @Test
    public void testCreateRole() {
        System.out.println("createRole");
        
        System.out.println("admin");
        String expResult = new AdminRole().toString();
        String result = admin.getRole().toString();
        assertEquals(expResult, result);
        
        System.out.println("user");
        expResult = new UserRole(user).toString();
        result = user.getRole().toString();
        assertEquals(expResult, result);
        
        System.out.println("dev");
        expResult = new DevRole(developer).toString();
        result = developer.getRole().toString();
        assertEquals(expResult, result);
        
        System.out.println("master");
        expResult = new ScrumMasterRole(scrum).toString();
        result = scrum.getRole().toString();
        assertEquals(expResult, result);
        
        System.out.println("anon");
        expResult = new AnonRole().toString();
        result = anon.getRole().toString();
        assertEquals(expResult, result);
        
        System.out.println("abcdefg");
        expResult = new AnonRole().toString();
        result = abcdefg.getRole().toString();
        assertEquals(expResult, result);
    }
}
