/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

import java.util.HashMap;

/**
 *
 * @author New Dynamic
 */
public class Maps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String,Integer> employeeIds = new HashMap<>();
        employeeIds.put("Zarin",1234);
        employeeIds.put("Hadika",5678);
        employeeIds.put("Taki",91011);
        employeeIds.put("DON",141516);
        employeeIds.put("Torres",307);
        System.out.println(employeeIds);
        System.out.println(employeeIds.get("Hadika"));
        System.out.println(employeeIds.containsKey("Taki"));
        System.out.println(employeeIds.containsValue(307));
       employeeIds.replace("DON",615141);
       System.out.println(employeeIds);
       employeeIds.put("Ferran",802);
       System.out.println(employeeIds);
       employeeIds.replace("Man City",3);
       System.out.println(employeeIds);
       employeeIds.putIfAbsent("Etihad",20);
       System.out.println(employeeIds);
       employeeIds.putIfAbsent("Hadika",2);
       System.out.println(employeeIds);
       employeeIds.remove("Etihad");
       System.out.println(employeeIds);
       
    }
    
}
