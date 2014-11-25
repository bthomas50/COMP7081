package server;

import java.io.BufferedReader;
import server.Roles.RoleFactory;
import server.Roles.Role;
import java.io.PrintWriter;

/**
 * The User object holds all relevant data and threads for a single user.
 *
 * @author Matthew Ku
 */
public class User {

    //Basic properties of a user
//    private final String userID;
//    private final String password;
//    private Role role;
//    private String teamName;
    private final UserCallable ut;
    private UserData ud;

    /**
     * Constructor userID - unique string identifying each user role - true if
     * user is administrator
     */
    public User(String userID, String passHash, String role, String teamName, BufferedReader sInput, PrintWriter sOutput, Server server) {

//        this.userID = userID;
//        this.password = passHash;
//        this.role = RoleFactory.createRole(role, this);
//        this.teamName = teamName;
        this.ud = new UserData(userID, passHash, RoleFactory.createRole(role, this), teamName);
        
        this.ut = new UserCallable(this, sInput, sOutput, server);
        ut.writeMsg("You are connected as " + userID + '\n');
    }

    public UserCallable getUserThread(){
        return ut;
    }
    
    public UserData getUD() {
        return ud;
    }
    
    public void setUD(UserData userData) {
        this.ud = userData;
    }
    
    public void closeUserThread() {
        ut.close();
    }

    public String getUserID() {
        return ud.getUserID();
    }

    public Role getRole() {
        return ud.getRole();
    }
    
    public int getRoleEnum()
    {
        return ud.getRole().getEnum();
    }
    
    public void setRole(Role r)
    {
        this.ud.setRole(r);
    }

    public String getTeamName() {
        return ud.getTeam();
    }

    public void setTeamName(String teamName) {
        this.ud.setTeam(teamName);
    }
    
    public String getPassword() {
        return ud.getPassword();
    }
    
    public boolean sendMessage(String message)
    {
        return ut.writeMsg(message);
    }
    
    public Server getServer()
    {
        return ut.getServer();
    }
    
}
