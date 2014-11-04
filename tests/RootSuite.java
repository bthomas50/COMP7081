/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Matt
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({server.ServerSuite.class, common.CommonSuite.class})
public class RootSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("Testing RootSuite: set up");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
