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
    public void testProcess() {
        System.out.println("process");
//        User pUser = null;
//        String sMsg = "";
//        int expResult = 0;
//        int result = SlashCommand.process(pUser, sMsg);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
