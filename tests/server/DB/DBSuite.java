/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.DB;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import server.TeamData;

/**
 *
 * @author Matt
 */
@RunWith(Suite.class)
@SuiteClasses({server.DB.TeamsTest.class, server.DB.DBTest.class, server.DB.UsersTest.class})
public class DBSuite {

    static String[] USERNAMES;
    static String[] PASSWORDS;
    static String[] ROLES;
    static String[] TEAMS;
    static String[] COMPANIES;
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Setting Up DBSuite");
        USERNAMES = new String[3];
        PASSWORDS = new String[3];
        ROLES = new String[3];
        TEAMS = new String[3];
        COMPANIES = new String[2];
        
        USERNAMES[0] = "TESTUSER1";
        PASSWORDS[0] = "TESTPASSWORD1";
        ROLES[0] = "TESTROLE1";
        TEAMS[0] = "TESTTEAM1";
        USERNAMES[1] = "TESTUSER2";
        PASSWORDS[1] = "TESTPASSWORD2";
        ROLES[1] = "TESTROLE2";
        TEAMS[1] = "TESTTEAM2";
        USERNAMES[2] = "TESTUSER3";
        PASSWORDS[2] = "TESTPASSWORD3";
        ROLES[2] = "";
        TEAMS[2] = TEAMS[1];
        COMPANIES[0] = "TESTCOMPANY1";
        COMPANIES[1] = "";
        try(Connection conn = DB.connect())
        {
            Teams.addTeam(conn, new TeamData(TEAMS[0], COMPANIES[0]));
            Teams.addTeam(conn, new TeamData(TEAMS[1], COMPANIES[1]));
            Users.addUser(conn, USERNAMES[0], PASSWORDS[0], ROLES[0], TEAMS[0]);
            Users.addUser(conn, USERNAMES[1], PASSWORDS[1], ROLES[1], TEAMS[1]);
            Users.addUser(conn, USERNAMES[2], PASSWORDS[2], ROLES[2], TEAMS[2]);
        }
        catch(SQLException sqle)
        {
            System.out.println("unable to add users to the db.");
        }
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Cleaning Up DBSuite");
        try(Connection conn = DB.connect())
        {
            Users.removeUser(conn, USERNAMES[0]);
            Users.removeUser(conn, USERNAMES[1]);
            Users.removeUser(conn, USERNAMES[2]);
            Teams.removeTeam(conn, TEAMS[0]);
            Teams.removeTeam(conn, TEAMS[1]);
        }
        catch(SQLException sqle)
        {
            System.out.println("unable to remove users to the db.");
        }
    }
    
}
