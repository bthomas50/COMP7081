/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import common.ChatMessage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matt
 */
public class ClientTest {
    
    public ClientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of start method, of class Client.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Client instance = null;
        boolean expResult = false;
        boolean result = instance.start();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessage method, of class Client.
     */
    @Test
    public void testSendMessage() {
        System.out.println("sendMessage");
        ChatMessage msg = null;
        Client instance = null;
        instance.sendMessage(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Client.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Client.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
