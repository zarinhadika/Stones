/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion.tutorial;

/**
 *
 * @author New Dynamic
 */
public class RecursionTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sayVugicugi(3);
    }
    private static void sayVugicugi(int stop)
    {
        System.out.println("VugiCugi");
        if(stop<=2)
        {
            return;
        }
        
        sayVugicugi(stop-1);
    }
}
