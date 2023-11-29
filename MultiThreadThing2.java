/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author New Dynamic
 */
class MultiThreadThing2 implements Runnable {
    private int threadNumber2;
    public MultiThreadThing2(int threadNumber2)
    {
        this.threadNumber2=threadNumber2;
    }
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i+" from Thread Number "+threadNumber2);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
               
            }
        }
    }
    
}
