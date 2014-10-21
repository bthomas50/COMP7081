package server;

import server.Roles.Role;
import server.Roles.RoleFactory;

/**
 *
 * @author a00795612
 */
public class UserData {
   
    private String userID;
    private String password;
    private Role role;
    private String team;
    private String companyName;
   
    public UserData(String userID, String passHash, Role role
            , String team, String companyName) {
        this.userID = userID;
        this.password = passHash;
        this.role = role;
        this.team = team;
        this.companyName = companyName;
    }
    //copy ctor
    public UserData(UserData other)
    {
        userID = other.userID;
        password = other.password;
        role = other.role;
        team = other.team;
        companyName = other.companyName;
    }
    //This constructor creates UserData objects that have dummy roles - for temporary use only.
    private UserData(String userID, String passHash, String roleName, String teamName, String companyName)
    {
        this(userID, passHash, RoleFactory.createRole(roleName, null), teamName, companyName);
    }
    //provide access to dangerous user data objects with a different-looking interface.
    public static UserData createDummyUserData(String userID, String passHash, String roleName, String teamName, String companyName)
    {
        return new UserData(userID, passHash, roleName, teamName, companyName);
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
    
    public void setCompany(String companyName)
    {
        this.companyName = companyName;
    }
    
    public String getCompany()
    {
        return companyName;
    }
   
}