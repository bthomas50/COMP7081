package server;

import common.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

/**
 * UserThread creates a thread to handle ChatMessage
 * and AddUser objects between the Server and User.
 * Currently all messages displayed to the user
 * is done through this class.
 * 
 * @author Matthew Ku
 */
public class UserThread extends Thread {

    private ObjectInputStream sInput;
    private ObjectOutputStream sOutput;
    // my unique id (easier for deconnection)
    private int id;
    // the date I connect
    private String date;
    //Server
    private Server server;
    
    private User user;

    // Constructor
    UserThread(User user, ObjectInputStream sInput, ObjectOutputStream sOutput, Server server) {

        this.user = user;
        this.server = server;
        this.sOutput = sOutput;
        this.sInput = sInput;
        date = new Date().toString() + "\n";
    }

    // what will run forever
    @Override
    public void run() {
        // to loop until LOGOUT
        boolean keepGoing = true;

        writeMsg("You are connected as " + user.getUserID() + '\n');

        while (keepGoing) {
            ChatMessage cm;
            try {
                cm = (ChatMessage) sInput.readObject();
            } catch (IOException e) {
                break;
            } catch (ClassNotFoundException e2) {
                break;
            }
            // the messaage part of the ChatMessage
            String message = cm.getMessage();

            if (cm instanceof AddUserMessage) {
                
            } else {
                // Switch on the type of message receive
                switch (cm.getType()) {
                    case ChatMessage.MESSAGE:
                        if (SlashCommand.process(user, message)) {
                    break;
                }
                        server.teamBroadcast(user.getTeam(), user.getUserID() + " (" + user.getTeam() + "): " + message);
                        break;
                    case ChatMessage.LOGOUT:
                        server.display(user.getUserID() + " disconnected with a LOGOUT message.");
                        keepGoing = false;
                        break;

                    case ChatMessage.WHOISIN:
                        writeMsg("List of the users connected at " + date);

                        // scan all the users connected
                        HashSet<User>userSet = server.getUserSet();
                        int i = 1;
                        
                        for(Iterator<User> iter = userSet.iterator(); iter.hasNext();)
                        {
                            User u = iter.next();
                            writeMsg((i++) + " " + u.getUserID() + " (" + u.getTeam() + ")\n");
                        }
                        break;
                }
            }

        }
        // remove myself from the arrayList containing the list of the
        // connected Clients
        server.remove(user);
        close();
    }

    // try to close everything
    @SuppressWarnings("empty-statement")
    public void close() {
        // try to close the connection
        try {
            if (sOutput != null) {
                sOutput.close();
            }
        } catch (Exception e) {
        }
        try {
            if (sInput != null) {
                sInput.close();
            }
        } catch (Exception e) {
        };
    }

    /*
     * Write a String to the Client output stream
     */
    public boolean writeMsg(String msg) {
        // write the message to the stream
        try {
            sOutput.writeObject(msg);
        } // if an error occurs, do not abort just inform the user
        catch (IOException e) {
            server.display("Error sending message to " + user.getUserID());
            server.display(e.toString());
        }
        return true;
    }

    public int getUId()
    {
        return id;
    }

}