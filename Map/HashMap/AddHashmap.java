package Map.HashMap;

import java.util.*;
public class AddHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> numbers = new HashMap<>();

        System.out.println("Initial HashMap: " + numbers);
        // put() method to add elements
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap after put(): " + numbers);
       
       //putall

       HashMap<String,Integer> m=new HashMap<>();
       m.put("Four", 4);
      m.put("Two", 45);
      System.out.println("map: "+m);

      numbers.putAll(m);
    System.out.println("numbers map: "+numbers);   


// create a TreeMap of String type
    TreeMap<String, String> treemap = new TreeMap<>();

    // add mappings to the TreeMap
    treemap.put("A", "Apple");
    treemap.put("B", "Ball");
    treemap.put("C", "Cat");
    System.out.println("TreeMap: " + treemap);

    // create a HashMap
    HashMap<String, String> hashmap = new HashMap<>();

    // add mapping to HashMap
    hashmap.put("Y", "Yak");
    hashmap.put("Z", "Zebra");
    System.out.println("Initial HashMap: " + hashmap);

    // add all mappings from TreeMap to HashMap
    hashmap.putAll(treemap);
    System.out.println("Updated HashMap: " + hashmap);

    
}
    
}
