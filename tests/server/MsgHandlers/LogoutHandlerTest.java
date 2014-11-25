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
public class LogoutHandlerTest {
    
    private User u;
    
    public LogoutHandlerTest() {
        //MODIFY THIS
        //Currently Server is null, once server is available, set to actual server
        u = new User("tester", "password", "admin", "testTeam", (BufferedReader) null, new PrintWriter(System.out), (Server) null);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of handle method, of class LogoutHandler.
     */
    @Test
    public void testHandle() {
        System.out.println("handle");
        User pUser = u;
        //LogoutHandler.handle(pUser);
    }
}
