/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.DB;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matt
 */
public class DBTest {
    
    public DBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of connect method, of class DB.
     */
    @Test
    public void testConnect() throws Exception {
        System.out.println("connect");
        Connection expResult = null;
        Connection result = DB.connect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printSQLException method, of class DB.
     */
    @Test
    public void testPrintSQLException() {
        System.out.println("printSQLException");
        SQLException ex = null;
        DB.printSQLException(ex);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
