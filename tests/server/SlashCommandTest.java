/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matt
 */
public class SlashCommandTest {
    
    public SlashCommandTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of process method, of class SlashCommand.
     */
    @Test
    public void testProcess() {
        System.out.println("process");
        User pUser = null;
        String sMsg = "";
        int expResult = 0;
        int result = SlashCommand.process(pUser, sMsg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
