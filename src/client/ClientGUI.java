package client;

import common.ChatMessage;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.jnlp.BasicService;
import javax.jnlp.ServiceManager;
import javax.jnlp.UnavailableServiceException;
import javax.swing.*;


/*
 * The Client with its GUI
 */
public class ClientGUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	// will first hold "Username:", later on "Enter message"
	private JLabel label;
	// to hold the Username and later on the messages
            JTextField tf;
	// to hold the server address an the port number
	private JTextField tfServer, tfPort;
	// to Logout and get the list of the users
	        JButton login, logout, whoIsIn;
	// for the chat room
	private JTextArea ta;
	// if it is for connection
            boolean connected;
	// the Client object
	private Client client;
	// the default port number
	private int defaultPort;
	private String defaultHost;

    private ClientHelperBar m_Helper;

    // Constructor connection receiving a socket number
	ClientGUI(String host, int port) {

		super("Chat Client");
		defaultPort = port;
		defaultHost = host;
		
		// The NorthPanel with:
		JPanel northPanel = new JPanel(new GridLayout(4,1));
		// the server name and the port number
		JPanel serverAndPort = new JPanel(new GridLayout(1,5, 1, 3));
		// the two JTextField with default value for server address and port number
		tfServer = new JTextField(host);
		tfPort = new JTextField("" + port);
		tfPort.setHorizontalAlignment(SwingConstants.RIGHT);

		serverAndPort.add(new JLabel("Server Address:  "));
		serverAndPort.add(tfServer);
		serverAndPort.add(new JLabel("Port Number:  "));
		serverAndPort.add(tfPort);
		serverAndPort.add(new JLabel(""));
		// adds the Server an port field to the GUI
		northPanel.add(serverAndPort);

		// the Label and the TextField
		label = new JLabel("Enter your username and password below separated by a colon", SwingConstants.CENTER);
		northPanel.add(label);
		tf = new JTextField("Anonymous:Any");
		tf.setBackground(Color.WHITE);
		northPanel.add(tf);
		add(northPanel, BorderLayout.NORTH);

        m_Helper = new ClientHelperBar(this);
        northPanel.add(m_Helper);
        
		// The CenterPanel which is the chat room
		ta = new JTextArea("Welcome to the Chat room\n", 80, 80);
		JPanel centerPanel = new JPanel(new GridLayout(1,1));
		centerPanel.add(new JScrollPane(ta));
		ta.setEditable(false);
		add(centerPanel, BorderLayout.CENTER);

		// the 3 buttons
		login = new JButton("Login");
		login.addActionListener(this);
		logout = new JButton("Logout");
		logout.addActionListener(this);
		logout.setEnabled(false);		// you have to login before being able to logout
		whoIsIn = new JButton("Who is in");
		whoIsIn.addActionListener(this);
		whoIsIn.setEnabled(false);		// you have to login before being able to Who is in

		JPanel southPanel = new JPanel();
		southPanel.add(login);
		southPanel.add(logout);
		southPanel.add(whoIsIn);
		add(southPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(680, 600);
		setVisible(true);
		tf.requestFocus();
        
        tf.addActionListener(this);
	}

	// called by the Client to append text in the TextArea 
	void append(String str) {
		ta.append(str);
		ta.setCaretPosition(ta.getText().length() - 1);
	}
	// called by the GUI is the connection failed
	// we reset our buttons, label, textfield
	void connectionFailed() {
		login.setEnabled(true);
		logout.setEnabled(false);
		whoIsIn.setEnabled(false);
		label.setText("Enter your username and password below separated by a colon");
		tf.setText("Anonymous:Any");
		// reset port number and host name as a construction time
		tfPort.setText("" + defaultPort);
		tfServer.setText(defaultHost);
		// let the user change them
		tfServer.setEditable(true);
		tfPort.setEditable(true);
		// don't react to a <CR> after the username
//		tf.removeActionListener(this);
		connected = false;
	}
		
	/*
	* Button or JTextField clicked
	*/
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();

        // if it is the Logout button
		if(o == logout) {
			client.sendMessage(new ChatMessage(ChatMessage.MESSAGE, "/logout"));
			return;
		}

        // if it the who is in button
		if(o == whoIsIn) {
			client.sendMessage(new ChatMessage(ChatMessage.MESSAGE, "/whoisin"));				
			return;
		}

		// ok it is coming from the JTextField
        if(o == tf && connected) {
            // just have to send the message
            String sMsg = tf.getText().trim();

            if (sMsg.length() == 0) return;
            
            if (e.getID() >= ActionEvent.ACTION_FIRST)
            {
                if (m_Helper.isTeamChatOn())
                    sMsg = "/t " + sMsg;
                else if (m_Helper.isCompanyChatOn())
                    sMsg = "/c " + sMsg;
            }
                
            client.sendMessage(new ChatMessage(ChatMessage.MESSAGE, sMsg));
            tf.setText("");
            return;
        }
		
		if(o == login || (o == tf && !connected)) {
			// ok it is a connection request
			String username = tf.getText().trim();
			// empty username ignore it
			if(username.length() == 0)
				return;
			// empty serverAddress ignore it
			String server = tfServer.getText().trim();
			if(server.length() == 0)
				return;
			// empty or invalid port numer, ignore it
			String portNumber = tfPort.getText().trim();
			if(portNumber.length() == 0)
				return;
			int port = 0;
			try {
				port = Integer.parseInt(portNumber);
			}
			catch(Exception en) {
				return;   // nothing I can do if port number is not valid
			}

			// try creating a new Client with GUI
			client = new Client(server, port, username, this);
			// test if we can start the Client
			if(!client.start()) 
				return;
			tf.setText("");
			label.setText("Enter your message below");
			connected = true;
			
			// disable login button
			login.setEnabled(false);
			// enable the 2 buttons
			logout.setEnabled(true);
			whoIsIn.setEnabled(true);
			// disable the Server and Port JTextField
			tfServer.setEditable(false);
			tfPort.setEditable(false);
		}

	}

	// to start the whole thing the server
	public static void main(String[] args) {
            try
            {
                BasicService jnlp = (BasicService) ServiceManager.lookup("javax.jnlp.BasicService");
                URL codeBase = jnlp.getCodeBase();
                new ClientGUI(codeBase.getHost(), 1500);
            }
            catch(Throwable ex)
            {
                System.err.println("Not running as a web start app");
//		new ClientGUI("localhost", 1500);
		new ClientGUI("ec2-54-148-79-116.us-west-2.compute.amazonaws.com", 1500);
            }
	}
}
