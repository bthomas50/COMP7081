/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package server.MsgHandlers;

import java.sql.Connection;
import server.DB.DB;
import server.DB.Users;
import server.User;
import server.UserData;

/**
 *
 * @author Brian
 */
public class SetCompanyHandler
{

    public static void handle(User pUser, String username, String newCompany) throws Exception
    {
        try(Connection conn = DB.connect())
        {
            UserData oldUD = Users.getDummyUserData(conn, username);
            UserData newUD = new UserData(oldUD);
            //newUD.setCompany(newCompany);
            if(pUser.getRole().canSetCompany(oldUD, newUD))
            {
                Users.setCompany(conn, username, newCompany);
            }
            else throw new Exception("Insufficient permission");
        }
    }
    
}
