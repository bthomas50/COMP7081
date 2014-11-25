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

/**
 *
 * @author Brian
 */
public class RandomClient implements Observer
{
    private final Client c;
    private final int threadIdx;
    private volatile boolean responseReceived;
    
    public RandomClient(String hostName, int port, String username, String password, int threadIdx)
    {
        c = new Client(hostName, port, username + " " + password);
        this.threadIdx = threadIdx;
    }
    
    public boolean start()
    {
        return c.start();
    }
    
    public float runLatencyTests()
    {
        long startMillis = System.currentTimeMillis();
        long elapsedMillis = 0;
        for(int i = 0; i < 100; i++)
        {
            c.sendMessage(new ChatMessage(0, "hello" + threadIdx));
            while(!responseReceived)
            {
                Thread.yield();
            }
            responseReceived = false;
        }
        elapsedMillis = System.currentTimeMillis() - startMillis;
        return (float) elapsedMillis / 100000f;
    }
    
    public void stop()
    {
        c.sendMessage(new ChatMessage(0, "/logout"));
    }

    @Override
    public void update(Observable o, Object arg)
    {
        String str = (String) arg;
        if(str.contains(Integer.toString(threadIdx)))
        {
            responseReceived = true;
        }
    }
}
