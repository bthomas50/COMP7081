/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package server.Roles;

import server.UserData;

/**
 *
 * @author Brian
 */
public interface Role extends Comparable<Role>
{
    public static final String ANONYMOUS = "anon";
    public static final String USER = "user";
    public static final String DEVELOPER = "dev";
    public static final String SCRUM_MASTER = "master";
    public static final String ADMINISTRATOR = "admin";
    
    public static final int E_ANON      = 0;
    public static final int E_USER      = 1;
    public static final int E_DEV       = 2;
    public static final int E_MASTER    = 3;
    public static final int E_ADMIN     = 4;
    
    public static final String[] AS_ROLENAMES = {ANONYMOUS, USER, DEVELOPER, SCRUM_MASTER, ADMINISTRATOR};
    
    @Override
    String toString();
    
    int getEnum();

    
    boolean canTeamChat(String teamName);
    boolean canAllChat();
    boolean canAddUser(UserData ud);
    boolean canRemoveUser(UserData ud);
    boolean canChangeRole(UserData oldUD, UserData newUD);
    public boolean canSetTeam(UserData oldUD, UserData newUD);
    public boolean canSetCompany(UserData oldUD, UserData newUD);
}
