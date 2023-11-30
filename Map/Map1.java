package Map;

import java.util.HashMap;
import java.util.*;
public class Map1 {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
    m.put(1, "c");
    m.put(2, "c++");
    m.put(3, "java");
    m.put(4, "python");
    System.out.println("map: "+m);
   
    m.put(2, "c#");
    System.out.println("map:"+m);

    if(!m.containsKey(5))
    {
          m.put(5, "js");

    }
    System.out.println("map:"+m);
    System.out.println("keyset: "+m.keySet());
    System.out.println("Valueset: "+m.values());
    System.out.println("enteryset: "+m.entrySet());


    }
    
}
