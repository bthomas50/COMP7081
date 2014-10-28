/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.DB;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Matt
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({server.DB.TeamsTest.class, server.DB.DBTest.class, server.DB.UsersTest.class})
public class DBSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
