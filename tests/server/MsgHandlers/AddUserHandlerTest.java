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
import server.DB.DB;

/**
 *
 * @author Matt
 */
public class AddUserHandlerTest {

    private User u;

    public AddUserHandlerTest() {
        u = new User("tester", "password", "admin", "testTeam", (BufferedReader) null, new PrintWriter(System.out), (Server) null);
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of handle method, of class AddUserHandler.
     */
    @Test
    public void testHandle() throws Exception {
        System.out.println("handle");
        String name = "testName";
        String password = "testPass";
        String role = "dev";
        String team = "test";
        //AddUserHandler.handle(u, name, password, role, team);
    }
}
