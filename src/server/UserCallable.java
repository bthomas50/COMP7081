package server;

import common.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/**
 * UserThread creates a thread to handle ChatMessage and AddUser objects between
 * the Server and User. Currently all messages displayed to the user is done
 * through this class.
 *
 * @author Matthew Ku
 */
public class UserCallable implements Callable<Boolean>
{

    private final BufferedReader sInput;
    private final PrintWriter sOutput;
    //Server
    private final Server server;

    private final User user;

    private boolean disconnected;

    // Constructor
    UserCallable(User user, BufferedReader sInput, PrintWriter sOutput, Server server)
    {

        this.user = user;
        this.server = server;
        this.sOutput = sOutput;
        this.sInput = sInput;
        this.disconnected = false;
    }

    // what will run forever
    @Override
    public Boolean call()
    {

        String message;
        try
        {
            if (sInput.ready())
            {
                return disconnected;
            }
            message = sInput.readLine();
        } catch (IOException e)
        {
            close();
            return disconnected;
        }
        // the messaage part of the ChatMessage
        int iResult = SlashCommand.process(user, message);
        if (iResult == SlashCommand.E_CONSUMED)
        {
            return disconnected;
        } else if (iResult == SlashCommand.E_IGNORED)
        {
            server.broadcast(user.getUserID() + " (" + user.getTeamName() + "): " + message);
        } else
        {
            server.teamBroadcast(
                    user.getTeamName(),
                    user.getUserID() + " (" + user.getTeamName() + "): "
                    + message.substring(iResult));
        }

        return disconnected;
    }

    // try to close everything
    @SuppressWarnings("empty-statement")
    public synchronized void close()
    {
        disconnected = true;
        if (sOutput != null)
        {
            sOutput.close();
        }
        try
        {
            if (sInput != null)
            {
                sInput.close();
            }
        } catch (IOException e)
        {
        };
    }

    /*
     * Write a String to the Client output stream
     */
    public synchronized boolean writeMsg(String msg)
    {
        sOutput.print(msg);
        sOutput.flush();
        return true;
    }

    public Server getServer()
    {
        return server;
    }

}
