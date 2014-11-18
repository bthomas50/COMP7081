/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assume.assumeNoException;

/**
 *
 * @author Matt
 */
public class SlashCommandTest {
    private static String[] COMMANDS;
    private static String INVALID_COMMAND_STR;
    private static String USER_CONNECTED_MSG;
    public SlashCommandTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        INVALID_COMMAND_STR = "Server> Valid commands: /adduser /deluser /setrole /setteam /setcompany /t\n";
        USER_CONNECTED_MSG = "You are connected as \n";
        COMMANDS = new String[12];
        COMMANDS[0] = "";
        COMMANDS[1] = "/t";
        COMMANDS[2] = "/c";
        COMMANDS[3] = "/adduser";
        COMMANDS[4] = "/deluser";
        COMMANDS[5] = "/setrole";
        COMMANDS[6] = "/setteam";
        COMMANDS[7] = "/setcompany";
        COMMANDS[8] = "/logout";
        COMMANDS[9] = "/whoisin";
        COMMANDS[10] = "/invalid";
        COMMANDS[11] = "gfyiygfi";
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    
    @Test
    public void testEmpty()
    {
        System.out.println("testEmpty");
        ByteArrayOutputStream TEST_STREAM = new ByteArrayOutputStream(1024);
        User TEST_USER = new User("","","Admin","",null,new PrintWriter(TEST_STREAM),null);
        int result = SlashCommand.process(TEST_USER, COMMANDS[0]);
    }
    @Test
    public void testTeamChat()
    {
        System.out.println("testTeamChat");
        ByteArrayOutputStream TEST_STREAM = new ByteArrayOutputStream(1024);
        User TEST_USER = new User("","","Admin","",null,new PrintWriter(TEST_STREAM),null);
        int result = SlashCommand.process(TEST_USER, COMMANDS[1]);
    }
    @Test
    public void testCompanyChat()
    {
        System.out.println("testCompanyChat");
        ByteArrayOutputStream TEST_STREAM = new ByteArrayOutputStream(1024);
        User TEST_USER = new User("","","Admin","",null,new PrintWriter(TEST_STREAM),null);
        int result = SlashCommand.process(TEST_USER, COMMANDS[2]);
    }
    @Test
    public void testAddUser()
    {
        System.out.println("testAddUser");
        ByteArrayOutputStream TEST_STREAM = new ByteArrayOutputStream(1024);
        User TEST_USER = new User("","","Admin","",null,new PrintWriter(TEST_STREAM),null);
        int result = SlashCommand.process(TEST_USER, COMMANDS[3]);
    }
    @Test
    public void testDelUser()
    {
        System.out.println("testDelUser");
        ByteArrayOutputStream TEST_STREAM = new ByteArrayOutputStream(1024);
        User TEST_USER = new User("","","Admin","",null,new PrintWriter(TEST_STREAM),null);
        int result = SlashCommand.process(TEST_USER, COMMANDS[4]);
    }
    @Test
    public void testSetRole()
    {
        System.out.println("testSetRole");
        ByteArrayOutputStream TEST_STREAM = new ByteArrayOutputStream(1024);
        User TEST_USER = new User("","","Admin","",null,new PrintWriter(TEST_STREAM),null);
        int result = SlashCommand.process(TEST_USER, COMMANDS[5]);
    }
    @Test
    public void testSetTeam()
    {
        System.out.println("testSetTeam");
        ByteArrayOutputStream TEST_STREAM = new ByteArrayOutputStream(1024);
        User TEST_USER = new User("","","Admin","",null,new PrintWriter(TEST_STREAM),null);
        int result = SlashCommand.process(TEST_USER, COMMANDS[6]);
    }
    @Test
    public void testCompany()
    {
        System.out.println("testCompany");
        ByteArrayOutputStream TEST_STREAM = new ByteArrayOutputStream(1024);
        User TEST_USER = new User("","","Admin","",null,new PrintWriter(TEST_STREAM),null);
        int result = SlashCommand.process(TEST_USER, COMMANDS[7]);
    }
    @Test
    public void testLogout()
    {
        System.out.println("testLogout");
        ByteArrayOutputStream TEST_STREAM = new ByteArrayOutputStream(1024);
        User TEST_USER = new User("","","Admin","",null,new PrintWriter(TEST_STREAM),null);
        int result = SlashCommand.process(TEST_USER, COMMANDS[8]);
    }
    @Test
    public void testWhoIsIn()
    {
        System.out.println("testWhoIsIn");
        ByteArrayOutputStream TEST_STREAM = new ByteArrayOutputStream(1024);
        User TEST_USER = new User("","","Admin","",null,new PrintWriter(TEST_STREAM),null);
        int result = SlashCommand.process(TEST_USER, COMMANDS[9]);
        assertEquals(SlashCommand.E_CONSUMED, result);
        try
        {
            assertEquals(USER_CONNECTED_MSG, TEST_STREAM.toString("UTF-8"));
        }
        catch(UnsupportedEncodingException e)
        {
            assumeNoException(e);
        }
    }
    @Test
    public void testInvalidCommand()
    {
        System.out.println("testInvalidCommand");
        ByteArrayOutputStream TEST_STREAM = new ByteArrayOutputStream(1024);
        User TEST_USER = new User("","","Admin","",null,new PrintWriter(TEST_STREAM),null);
        int result = SlashCommand.process(TEST_USER, COMMANDS[10]);
        assertEquals(SlashCommand.E_CONSUMED, result);
        try
        {
            assertEquals(USER_CONNECTED_MSG + INVALID_COMMAND_STR, TEST_STREAM.toString("UTF-8"));
        }
        catch(UnsupportedEncodingException e)
        {
            assumeNoException(e);
        }
        result = SlashCommand.process(TEST_USER, COMMANDS[10] + " " + "anytyewrivyi");
        assertEquals(SlashCommand.E_CONSUMED, result);
    }
    @Test
    public void testGarbage()
    {
        System.out.println("testGarbage");
        ByteArrayOutputStream TEST_STREAM = new ByteArrayOutputStream(1024);
        User TEST_USER = new User("","","Admin","",null,new PrintWriter(TEST_STREAM),null);
        int result = SlashCommand.process(TEST_USER, COMMANDS[11]);
        assertEquals(SlashCommand.E_IGNORED, result);
        try
        {
            assertEquals(USER_CONNECTED_MSG, TEST_STREAM.toString("UTF-8"));
        }
        catch(UnsupportedEncodingException e)
        {
            assumeNoException(e);
        }
    }
}
