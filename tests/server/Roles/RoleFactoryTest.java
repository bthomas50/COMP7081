/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.Roles;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import server.User;

/**
 *
 * @author Matt
 */
public class RoleFactoryTest {
    
    public RoleFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createRole method, of class RoleFactory.
     */
    @Test
    public void testCreateRole() {
        System.out.println("createRole");
        String role = "";
        User user = null;
        Role expResult = null;
        Role result = RoleFactory.createRole(role, user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
