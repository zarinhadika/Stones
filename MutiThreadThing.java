/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author New Dynamic
 */
public class MutiThreadThing extends Thread{
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }
    }
    
}
