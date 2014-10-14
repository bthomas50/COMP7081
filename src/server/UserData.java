package server;

import server.Roles.Role;

/**
 *
 * @author a00795612
 */
public class UserData {
   
    private String userID;
    private String password;
    private Role role;
    private String team;
   
    public UserData(String userID, String passHash, Role role
            , String team) {
        this.userID = userID;
        this.password = passHash;
        this.role = role;
        this.team = team;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
   
}