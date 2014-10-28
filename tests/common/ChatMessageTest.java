/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matt
 */
public class ChatMessageTest {
    
    public ChatMessageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getType method, of class ChatMessage.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        ChatMessage instance = null;
        int expResult = 0;
        int result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class ChatMessage.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        ChatMessage instance = null;
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
