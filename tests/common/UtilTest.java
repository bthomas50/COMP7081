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
public class UtilTest {
    
    public UtilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of mySQLCompatibleMD5 method, of class Util.
     */
    @Test
    public void testMySQLCompatibleMD5() {
        System.out.println("mySQLCompatibleMD5");
        String s = "password";
        String s2 = "password2";
        String expResult = "5f4dcc3b5aa765d61d8327deb882cf99";
        String result = Util.mySQLCompatibleMD5(s);
        assertEquals(expResult, result);
        assertFalse(expResult.equals(Util.mySQLCompatibleMD5(s2)));
    }
}
