/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package server;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author Brian
 */
public class AsyncListener extends Thread
{
    private final ExecutorService userThreadPool;
    private final Map<User, Future<Boolean>> futureMap;
    
    public AsyncListener()
    {
        userThreadPool = Executors.newFixedThreadPool(100);
        //allocate space in the map for 10k users.
        futureMap = new HashMap<>(10000);
    }
    
    @Override
    public void run()
    {
        while(true)
        {
            synchronized(this)
            {
                for(Iterator<Map.Entry<User, Future<Boolean>>> iter = futureMap.entrySet().iterator(); iter.hasNext();)
                {
                    Map.Entry<User, Future<Boolean>> ent = iter.next();
                    try
                    {
                        if(ent.getValue().isDone())
                        {
                            if(!ent.getValue().get())
                            {
                                ent.setValue(userThreadPool.submit(ent.getKey().getUserThread()));
                            }
                            else 
                            {
                                iter.remove();
                            }
                        }
                        
                    } catch(InterruptedException | ExecutionException e)
                    {
                    }
                }
            }
        }
    }
    
    public synchronized void addUser(User u)
    {
        futureMap.put(u, userThreadPool.submit(u.getUserThread()));
    }
}
