package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapUsingTreemap {
    public static void main(String[] args) {
        Map<String,Integer> num=new TreeMap<>();//trreset uses binary map natural order
        //insert according to string natural order(key order):- string
        
        num.put("One", 10);
        num.put("Two", 20);
        num.put("Three", 30);
        num.put("Four", 40);
        num.put("Five", 50);
         
        System.out.println("Map: "+num);

        num.replace("Two", 40);
        System.out.println("Map: "+num);

        int rem=num.remove("Three");
        System.out.println("Remove key Three: "+rem);

        System.out.println("Map: "+num);
        
       // supose if u dont want overide
       if(!num.containsKey("Four"))
       {
         num.put("Four", 78);
       }
   
       //or u can use

     num.putIfAbsent("Two", 56);

     //iterate
     System.out.println("Iterate through entery set");
     for(Map.Entry<String,Integer> m:num.entrySet())
     {
        System.out.println(m.getKey());
        System.out.println(m.getValue());
     }


     System.out.println("Iterate through key set");
    for(String s:num.keySet())
    {
     System.out.println(s);
    }     

     System.out.println("Iterate through values set");
    for(Integer i:num.values())
    {
     System.out.println(i);
    }  

    }
}
