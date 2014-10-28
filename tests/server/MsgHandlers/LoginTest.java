/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.MsgHandlers;

import java.net.Socket;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import server.Server;

/**
 *
 * @author Matt
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() throws Exception {
        System.out.println("loginUser");
        Server server = null;
        Socket sock = null;
        Login.loginUser(server, sock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
