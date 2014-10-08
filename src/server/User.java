package server;

import java.io.BufferedReader;
import server.Roles.RoleFactory;
import server.Roles.Role;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.concurrent.Callable;

/**
 * The User object holds all relevant data and threads for a single user.
 *
 * @author Matthew Ku
 */
public class User {

    //Basic properties of a user
    private final String userID;
    private final String password;
    private Role role;
    private String teamName;
    private final UserCallable ut;

    /**
     * Constructor userID - unique string identifying each user role - true if
     * user is administrator
     */
    public User(String userID, String passHash, String role, String teamName, BufferedReader sInput, PrintWriter sOutput, Server server) {

        this.userID = userID;
        this.password = passHash;
        this.role = RoleFactory.createRole(role, this);
        this.teamName = teamName;
        
        this.ut = new UserCallable(this, sInput, sOutput, server);
        ut.writeMsg("You are connected as " + userID + '\n');
    }

    public UserCallable getUserThread(){
        return ut;
    }
    
    public void closeUserThread() {
        ut.close();
    }

    public String getUserID() {
        return userID;
    }

    public Role getRole() {
        return role;
    }
    
    public int getRoleEnum()
    {
        return role.getEnum();
    }
    
    public void setRole(Role r)
    {
        role = r;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public boolean sendMessage(String message)
    {
        return ut.writeMsg(message);
    }
    
    public Server getServer()
    {
        return ut.getServer();
    }

    public String getCompany()
    {
        throw new UnsupportedOperationException();
    }
}
