/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package server.MsgHandlers;

import common.Util;
import java.sql.Connection;
import java.sql.SQLException;
import server.DB.DB;
import server.DB.Users;
import server.User;
import server.UserData;

/**
 *
 * @author Brian
 */
public class AddUserHandler
{
    public static void handle(User user, String name, String password, String role, String team) throws Exception
    {
        Connection conn;
        if(user.getRole().canAddUser(UserData.createDummyUserData(name, password, role, team)))
        {
            conn = DB.connect();
            innerHandle(conn, name, password, role, team);
            conn.close();
        }
        else
        {
            throw new Exception();
        }
    }
    private static void innerHandle(Connection conn, String name, String password, String role, String team) throws SQLException
    {
        if(team == null)
        {
            Users.addUser(conn, name, Util.mySQLCompatibleMD5(password), role, "");
        }
        else
        {
            Users.addUser(conn, name, Util.mySQLCompatibleMD5(password), role, team);
        }
    }
}
