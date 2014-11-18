/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.MsgHandlers;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import server.Server;

/**
 *
 * @author Matt
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({server.MsgHandlers.SetCompanyHandlerTest.class, server.MsgHandlers.WhoIsInHandlerTest.class, server.MsgHandlers.AddUserHandlerTest.class, server.MsgHandlers.SetTeamHandlerTest.class, server.MsgHandlers.LoginTest.class, server.MsgHandlers.SetRoleHandlerTest.class, server.MsgHandlers.RemoveUserHandlerTest.class, server.MsgHandlers.LogoutHandlerTest.class})
public class MsgHandlersSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
