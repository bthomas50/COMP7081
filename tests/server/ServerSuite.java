/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Matt
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({server.DB.DBSuite.class, server.TeamDataTest.class, server.AsyncListenerTest.class, server.Roles.RolesSuite.class, server.TeamTest.class, server.ServerTest.class, server.SlashCommandTest.class, server.UserTest.class, server.CompanyTest.class, server.ServerGUITest.class, server.UserCallableTest.class, server.UserDataTest.class, server.MsgHandlers.MsgHandlersSuite.class})
public class ServerSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
