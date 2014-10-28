/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Matt
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({client.ClientSetCompanyDialogTest.class, client.ClientSetRoleDialogTest.class, client.ClientAddUserDialogTest.class, client.ClientTest.class, client.ClientDelUserDialogTest.class, client.ClientGUITest.class, client.ClientSetTeamDialogTest.class, client.ClientLoginDialogTest.class, client.ClientHelperBarTest.class})
public class ClientSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
