/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sets2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author New Dynamic
 */
public class Sets2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Set <String> numbers = new LinkedHashSet<>();
      numbers.add("Steve");
      numbers.add("John");
      numbers.add("RobinSon");
      numbers.add("Justin");
      numbers.add("Jason");
      numbers.add("Mary");
      numbers.remove("Taylor");
      System.out.println(numbers.size());
     numbers.forEach(System.out::println);
     Iterator <String> numbersIterator = numbers.iterator();
     while(numbersIterator.hasNext())
     {
         System.out.println(numbersIterator.next());
     }
     List <Double> numberList = new ArrayList<>();
     numberList.add(23.59);
     numberList.add(5.9);
     numberList.add(4.05);
     numberList.add(1.2);
     numberList.add(239.12);
     numberList.add(23.59);
     System.out.println(numberList);
     Set <Double> numberListToSet = new HashSet<>(numberList);
     //numberListToSet.add(numberList);
     System.out.println(numberListToSet);
     
     
     
    }
    
}
