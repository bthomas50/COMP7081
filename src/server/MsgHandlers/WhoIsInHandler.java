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
public class WhoIsInHandler
{
    public static void handle(User pUser)
    {
        if(pUser.getServer() == null)
        {
            throw new IllegalStateException("user has no server");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Logged in users:\n");
        for(User u : pUser.getServer().getAllUsers())
        {
            sb.append(u.getUserID()).append(" on team ").append(u.getTeamName()).append("\n");
        }
        pUser.sendMessage(sb.toString());
    }
}
