/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package server;

/**
 *
 * @author Brian
 */
public interface Role extends Comparable<String>
{
    public static final String USER = "user";
    public static final String ADMINISTRATOR = "admin";
    public static final String DEVELOPER = "dev";
    public static final String SCRUM_MASTER = "master";
    
    boolean canAddUser(String team);
    boolean canRemoveUser(String team);
    boolean canChangeRole(String team, String newRole);
    @Override
    String toString();
}
