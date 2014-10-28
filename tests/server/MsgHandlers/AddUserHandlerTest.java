/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.MsgHandlers;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import server.User;

/**
 *
 * @author Matt
 */
public class AddUserHandlerTest {
    
    public AddUserHandlerTest() {
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
        User user = null;
        String name = "";
        String password = "";
        String role = "";
        String team = "";
        AddUserHandler.handle(user, name, password, role, team);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
