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
public class AsyncListenerTest {
    
    public AsyncListenerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of run method, of class AsyncListener.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        AsyncListener instance = new AsyncListener();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class AsyncListener.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        User u = null;
        AsyncListener instance = new AsyncListener();
        instance.addUser(u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
