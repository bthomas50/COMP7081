/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

/**
 *
 * @author Brian
 */
public class testmain
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 10; i++)
        {
            RandomClient c = new RandomClient("localhost", 1500, "testuser", "password", 5);
            if(!c.start())
            {
                System.out.println("failed to connect.");
                return;
            }
            if(!c.runLatencyTests())
            {
                System.out.println("disconnected during tests.");
            }
            c.stop();
        }
    }
}
