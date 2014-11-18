/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.MsgHandlers;

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
public class SetRoleHandlerTest {
    
    private User u;
    
    public SetRoleHandlerTest() {
        //pass in server
        u = new User("tester", "password", "admin", "testTeam", (BufferedReader) null, new PrintWriter(System.out), (Server) null);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of handle method, of class SetRoleHandler.
     */
    @Test
    public void testHandle() throws Exception {
        System.out.println("handle");
        User user = u;
        String name = "test1";
        String newRole = "dev";
        SetRoleHandler.handle(user, name, newRole);
    }
}
