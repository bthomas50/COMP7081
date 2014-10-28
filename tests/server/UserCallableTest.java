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
public class UserCallableTest {
    
    public UserCallableTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of call method, of class UserCallable.
     */
    @Test
    public void testCall() {
        System.out.println("call");
        UserCallable instance = null;
        Boolean expResult = null;
        Boolean result = instance.call();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class UserCallable.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        UserCallable instance = null;
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeMsg method, of class UserCallable.
     */
    @Test
    public void testWriteMsg() {
        System.out.println("writeMsg");
        String msg = "";
        UserCallable instance = null;
        boolean expResult = false;
        boolean result = instance.writeMsg(msg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServer method, of class UserCallable.
     */
    @Test
    public void testGetServer() {
        System.out.println("getServer");
        UserCallable instance = null;
        Server expResult = null;
        Server result = instance.getServer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
