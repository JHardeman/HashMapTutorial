package org.wcci;

import java.util.HashMap;

public class HashMapAwesomeness {

    public static void main(String[] args) {

        // Remember that you MUST list what type of Key and Value are being stored in the HashMap
        // Here is a simple username and password that are two Strings, identified in the alligator brackets

     HashMap<String, String> fun = new HashMap<String, String>();

        // Above we have created a HashMap with the name "fun"
        // Below we will add the username and passwords to the HashMap
        // First call the HashMap by its name "fun"
        // Then using the ".put" keyword we will add those usernames and passwords

     fun.put("bobbyJoe1996", "FluffyP0nies!");
     fun.put("helloKittyfan21", "AloeVera?");
     fun.put("coolguyswag", "password123");

     // To show the contents of the HashMap simply println with the name of the HashMap
        System.out.println(fun);

        // You can also check for certain Keys within the HashMap
        System.out.println(fun.containsKey("bobbyJoe1996"));
        // You will see a "true" statement if that Key is within the HasMap or "false" if it is not

        // Or Values in the Map
        System.out.println(fun.containsValue("AloeVera?"));

        // Here we are using the replace function to relocate the Key and replace it with another
     System.out.println(fun.replace("bobbyJoe1996", "b3tt3rP@ssword!"));
        // Once this is printed out, you will see the previous Value listed above the HashMap, then the new Value
        // shown within the Map
        
     System.out.println(fun);
    }
}
