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
public class Multithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0;i<=3;i++)
        {
            MultiThreadThing myThing=new MultiThreadThing(i);
            Thread myThread= new Thread(myThing);
            myThread.start();
            try {
                myThread.join();
            } catch (InterruptedException ex) {
                
            }
            myThread.isAlive();
        }
        
      
      
   
    }
    
}
