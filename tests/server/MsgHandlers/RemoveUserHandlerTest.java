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
public class RemoveUserHandlerTest {
    
    public RemoveUserHandlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of handle method, of class RemoveUserHandler.
     */
    @Test
    public void testHandle() throws Exception {
        System.out.println("handle");
        User user = null;
        String name = "";
        RemoveUserHandler.handle(user, name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
