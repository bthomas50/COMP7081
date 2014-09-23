package server;

import common.ChatMessage;
import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;
import server.Login;

/*
 * The server that can be run both as a console application or a GUI
 */
public class Server {
	// a unique ID for each connection
	private static int uniqueId;
	// an ArrayList to keep the list of the Client
	private HashSet<User> userSet;
	// if I am in a GUI
	private ServerGUI sg;
	// to display time
	private SimpleDateFormat sdf;
	// the port number to listen for connection
	private int port;
	// the boolean that will be turned of to stop the server
	private boolean keepGoing;
	

	/*
	 *  server constructor that receive the port to listen to for connection as parameter
	 *  in console
	 */
	public Server(int port) {
		this(port, null);
	}
	
	public Server(int port, ServerGUI sg) {
		// GUI or not
		this.sg = sg;
		// the port
		this.port = port;
		// to display hh:mm:ss
		sdf = new SimpleDateFormat("HH:mm:ss");
		// ArrayList for the Client list
		userSet = new HashSet<User>();
	}
	
	public void start() {
		keepGoing = true;
		/* create socket server and wait for connection requests */
		try 
		{
			// the socket used by the server
			ServerSocket serverSocket = new ServerSocket(port);

			// infinite loop to wait for connections
			while(keepGoing) 
			{
				// format message saying we are waiting
				display("Server waiting for Clients on port " + port + ".");
				
				Socket socket = serverSocket.accept();  	// accept connection
				// if I was asked to stop
				if(!keepGoing)
					break;

                User toLogin = Login.loginUser(this, socket);
				userSet.add(toLogin);// save it in the ArrayList
			}
			// I was asked to stop
			try {
				serverSocket.close();
				for(User u : userSet)
                {
                    u.closeUserThread();
                }
			}
			catch(Exception e) {
				display("Exception closing the server and clients: " + e);
			}
		}
		// something went bad
		catch (IOException e) {
            String msg = sdf.format(new Date()) + " Exception on new ServerSocket: " + e + "\n";
			display(msg);
		}
	}		
    /*
     * For the GUI to stop the server
     */
	protected void stop() {
		keepGoing = false;
		// connect to myself as Client to exit statement 
		// Socket socket = serverSocket.accept();
		try {
			new Socket("localhost", port);
		}
		catch(Exception e) {
			// nothing I can really do
		}
	}
	/*
	 * Display an event (not a message) to the console or the GUI
	 */
	public void display(String msg) {
		String time = sdf.format(new Date()) + " " + msg;
		if(sg == null)
			System.out.println(time);
		else
			sg.appendEvent(time + "\n");
	}

    /*
	 *  to broadcast a message to all Clients
	 */
	public synchronized void broadcast(String message)
    {
		// add HH:mm:ss and \n to the message
		String time = sdf.format(new Date());
		String messageLf = time + " " + message + "\n";
		// display message on console or GUI
		if(sg == null)
			System.out.print(messageLf);
		else
			sg.appendRoom(messageLf);     // append in the room window
		
		for(Iterator<User> iter = userSet.iterator(); iter.hasNext();)
        {
            User u = iter.next();
            
			if (!u.getUt().writeMsg(messageLf))
            {
                iter.remove();
				display("Disconnected Client " + u.getUserID() + " removed from list.");
			}
		}
	}

	// Broadcast a message to all clients in the same team
	public synchronized void teamBroadcast(String team, String message)
    {
		String time = sdf.format(new Date());
		String messageLf = time + " " + message + "\n";

        if(sg == null)
			System.out.print(messageLf);
		else
			sg.appendRoom(messageLf);
		
		for(Iterator<User> iter = userSet.iterator(); iter.hasNext();)
        {
            User u = iter.next();

            if (!u.getTeam().equals(team))
                continue;
            
			if (!u.getUt().writeMsg(messageLf))
            {
                iter.remove();
				display("Disconnected Client " + u.getUserID() + " removed from list.");
			}
		}
	}

    // for a client who logoff using the LOGOUT message
	synchronized void remove(User u) {
	    userSet.remove(u);
	}
	
	/*
	 *  To run as a console application just open a console window and: 
	 * > java Server
	 * > java Server portNumber
	 * If the port number is not specified 1500 is used
	 */ 
	public static void main(String[] args) {
		// start server on port 1500 unless a PortNumber is specified 
		int portNumber = 1500;
		switch(args.length) {
			case 1:
				try {
					portNumber = Integer.parseInt(args[0]);
				}
				catch(Exception e) {
					System.out.println("Invalid port number.");
					System.out.println("Usage is: > java Server [portNumber]");
					return;
				}
			case 0:
				break;
			default:
				System.out.println("Usage is: > java Server [portNumber]");
				return;
				
		}
		// create a server object and start it
		Server server = new Server(portNumber);
		server.start();
	}
    
	public HashSet<User> getUserSet()
    {
        return userSet;
    }

}
