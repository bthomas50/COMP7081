/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.awt.event.ActionEvent;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matt
 */
public class ClientGUITest {
    
    public ClientGUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of append method, of class ClientGUI.
     */
    @Test
    public void testAppend() {
        System.out.println("append");
        String str = "";
        ClientGUI instance = null;
        instance.append(str);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connectionFailed method, of class ClientGUI.
     */
    @Test
    public void testConnectionFailed() {
        System.out.println("connectionFailed");
        ClientGUI instance = null;
        instance.connectionFailed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class ClientGUI.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        ClientGUI instance = null;
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ClientGUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ClientGUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
