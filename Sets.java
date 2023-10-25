/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author New Dynamic
 */
public class Sets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set <String> names = new HashSet<>();
        names.add("Jennifer");
        names.add("Julia");
        names.add("Justin");
        names.add("Mark");
        names.add("Armstrong");
        names.add("Steven");
        names.add("Jennifer");
        //names.remove("Jennifer");
        for(String name:names)
        {
            System.out.println(name);
        }
     Iterator <String> namesIterator =names.iterator();
     while(namesIterator.hasNext())
     {
         System.out.println(namesIterator.next());
     }
      
     List <Integer> numberList = new ArrayList<>();
     numberList.add(1);
     numberList.add(2);
     numberList.add(3);
     numberList.add(4);
     numberList.add(1);
     System.out.println(numberList);
     Set <Integer> numberSet = new HashSet<>();
     numberSet.addAll(numberList);
     System.out.println(numberSet);
        
        
    }
    
}
