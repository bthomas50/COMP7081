package server.MsgHandlers;

import common.LoginMessage;
import common.Util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Connection;
import java.sql.SQLException;
import server.DB.DB;
import server.DB.Users;
import server.Server;
import server.User;

/**
 * This class is used by the Server to connect
 * and grab the information of a user from the database.
 * 
 * @author Brian
 */
public class Login
{
    
    private Login()
    {
    }

	//  handle login message and return the correct type of user,    
	// or an anonymous user if the login info is not found
    public static User loginUser(Server server, Socket sock) throws IOException
    {
        PrintWriter sOutput = new PrintWriter(sock.getOutputStream());
        BufferedReader sInput = new BufferedReader(new InputStreamReader(sock.getInputStream()));
        try
        {
            //block until we get a message.
            String msg = sInput.readLine();
            String[] strs = msg.split(" ");
            Connection conn = DB.connect();
            if(strs.length < 2)
                return new User("Anonymous", "", "", "default", sInput, sOutput, server);
            switch (Users.getPassword(conn, strs[0], Util.mySQLCompatibleMD5(strs[1])))
            {
                case SUCCESS:
                    return new User(strs[0],
                                    strs[1],
                                    Users.getRole(conn, strs[0]),
                                    Users.getTeam(conn, strs[0]),
                                    sInput, sOutput, server);
                default:
                    return new User("Anonymous", "", "", "default", sInput, sOutput, server);
            }
        } catch (SQLException ex)
        {
            DB.printSQLException(ex);
            return new User("Anonymous", "", "", "default", sInput, sOutput, server);
        }
    }
    
}
