/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author New Dynamic
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Cat.getCatCount());
        Cat mycat=new Cat();
        
        mycat.Meow();
        mycat.name="Stella";
        mycat.age=8;
        System.out.println(Cat.getCatCount());
        //System.out.println(mycat.getCatCount());
        System.out.println(Cat.MAX_LIVES);
        
    }
    
}
