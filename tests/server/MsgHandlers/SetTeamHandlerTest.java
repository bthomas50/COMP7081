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
public class SetTeamHandlerTest {
    
    public SetTeamHandlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of handle method, of class SetTeamHandler.
     */
    @Test
    public void testHandle() throws Exception {
        System.out.println("handle");
        User pUser = null;
        String username = "";
        String newTeamName = "";
        SetTeamHandler.handle(pUser, username, newTeamName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
