/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package server.MsgHandlers;

import server.User;

/**
 *
 * @author Brian
 */
public class LogoutHandler
{
    public static void handle(User pUser)
    {
        pUser.sendMessage("Logged out.");
        pUser.getServer().display(pUser.getUserID() + " logged out.");
        pUser.getServer().removeUser(pUser);
    }
}
