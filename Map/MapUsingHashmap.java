package Map;
import java.util.*;
import java.util.HashMap;

public class MapUsingHashmap {
    public static void main(String[] args) {
        Map<String,Integer> num=new HashMap<>();
        num.put("One", 1);
        num.put("Two", 2);
        num.put("Three", 3);
        num.put("Four", 4);
        num.put("Five", 5);
       
        System.out.println("Map: "+num);

        // if u change key value like
        num.put("Two", 23);//it will be overide
        System.out.println("overide Map: "+num);
        
        //if u dont want to overide

        if(!num.containsKey("Three"))
        {
          num.put("Three", 40);
        }

        //or u can use

        num.putIfAbsent("One", 9);// if key value is not absent then enter key value

        System.out.println("keyset: "+num.keySet());

        System.out.println("ValueSet: "+num.values());

        System.out.println("KeyValues: "+num.entrySet());//key value both contain

        int rem=num.remove("Two");
        System.out.println("remove: "+rem);

        System.out.println("Map: "+num);
       //iteration in key value set
       System.out.println("iteration in key value set");
        for(Map.Entry<String,Integer> m:num.entrySet())
        {
         System.out.println(m.getKey());
         System.out.println(m.getValue());
        
        }      
        System.out.println("iteration over keyset:");

        for(String s:num.keySet())
        {
            System.out.println(s);
        }

        System.out.println("iteration over valueset:");
        
        for(int val:num.values())
        {
            System.out.println(val);
        }

     System.out.println("contains value 23: "+num.containsValue(23));
     System.out.println("contains key Two: "+num.containsKey("Two"));
     



    }
    
}
