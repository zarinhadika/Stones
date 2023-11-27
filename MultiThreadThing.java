/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author New Dynamic
 */
class MultiThreadThing implements Runnable {
    private int threadNumber;
    public MultiThreadThing(int threadNumber)
            {
                this.threadNumber=threadNumber;
            }
 
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i+" from Thread "+threadNumber);
           
            
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            
        }
        }
       
    }
}
