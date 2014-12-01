/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

import common.ChatMessage;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brian
 */
public class RandomClient implements Observer
{
    private final Client c;
    private final String realUsername;
    private volatile boolean responseReceived;
    private volatile boolean disconnected;
    private volatile boolean loggedIn;
    
    private long msTimeOut = 500;
    
    public RandomClient(String hostName, int port, String username, String password, int threadIdx)
    {
        realUsername = username + threadIdx;
        disconnected = false;
        responseReceived = false;
        c = new Client(hostName, port, realUsername + " " + password);
    }
    
    public boolean start()
    {
        c.setListener(this);
        c.start();
        while(!loggedIn && !disconnected)
        {
            Thread.yield();
        }
        return !disconnected;
    }
    
    public boolean runLatencyTests()
    {
        
        for(int i = 0; i < 10; i++)
        {
            sendMessage();
            while(!responseReceived && !disconnected)
            {
                Thread.yield();
            }
            if(disconnected) break;
            responseReceived = false;
        }
        return !disconnected;
        
    }
    
    public void stop()
    {
        c.sendMessage(new ChatMessage(0, "/logout"));
        while(!disconnected)
        {
            Thread.yield();
        }
    }

    @Override
    public synchronized void update(Observable o, Object arg)
    {
        if(arg == null)
        {
            disconnected = true;
            return;
        }
        String str = (String) arg;
        
        if(str.startsWith("Logged"))
        {
            responseReceived = true;
            return;
        }
        if(str.endsWith("user"))
        {
            loggedIn = true;
            return;
        }
    }
    
    
    private synchronized void sendMessage()
    {
        c.sendMessage(new ChatMessage(0, "/whoisin"));
    }
}
