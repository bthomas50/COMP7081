/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.Roles;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Matt
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({server.Roles.DevRoleTest.class, server.Roles.RoleFactoryTest.class, server.Roles.AdminRoleTest.class, server.Roles.ScrumMasterRoleTest.class, server.Roles.AnonRoleTest.class, server.Roles.UserRoleTest.class})
public class RolesSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
