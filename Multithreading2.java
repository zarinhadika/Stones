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
public class Multithreading2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      for(int i=0;i<=3;i++)
      {
          MultiThreadThing2 myThing3 = new MultiThreadThing2(i);
          Thread newThread2=new Thread(myThing3);
          newThread2.start();
          newThread2.isAlive();
          try {
              newThread2.join();
          } catch (InterruptedException ex) {
              
          }
      }
      
      }
      
      
    }
    

