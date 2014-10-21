/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package server.MsgHandlers;

import java.sql.Connection;
import server.DB.DB;
import server.DB.Users;
import server.Roles.RoleFactory;
import server.User;
import server.UserData;

/**
 *
 * @author Brian
 */
public class SetRoleHandler
{
    public static void handle(User user, String name, String newRole) throws Exception
    {
        try(Connection conn = DB.connect())
        {
            UserData oldUD = Users.getDummyUserData(conn, name);
            UserData newUD = new UserData(oldUD);
            newUD.setRole(RoleFactory.createRole(newRole, null));
            if(user.getRole().canChangeRole(oldUD, newUD))
            {
                Users.setRole(conn, name, newRole);
                User onlineUser = user.getServer().getUser(name);
                if(onlineUser != null)
                {
                    onlineUser.setRole(RoleFactory.createRole(newRole, onlineUser));
                }
            }
            else
            {
                throw new Exception();
            }
        }
        
    }
}
