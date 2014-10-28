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
public class AddUserMessageTest {
    
    public AddUserMessageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getUserId method, of class AddUserMessage.
     */
    @Test
    public void testGetUserId() {
        System.out.println("getUserId");
        AddUserMessage instance = null;
        String expResult = "";
        String result = instance.getUserId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassHash method, of class AddUserMessage.
     */
    @Test
    public void testGetPassHash() {
        System.out.println("getPassHash");
        AddUserMessage instance = null;
        String expResult = "";
        String result = instance.getPassHash();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRole method, of class AddUserMessage.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
        AddUserMessage instance = null;
        String expResult = "";
        String result = instance.getRole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeam method, of class AddUserMessage.
     */
    @Test
    public void testGetTeam() {
        System.out.println("getTeam");
        AddUserMessage instance = null;
        String expResult = "";
        String result = instance.getTeam();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
