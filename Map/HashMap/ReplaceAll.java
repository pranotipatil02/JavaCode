package Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class ReplaceAll {
    public static void main(String[] args) {
    Map<Integer,String> map=new HashMap<>();
    map.put(1, "c");
    map.put(2, "c++");
    map.put(3, "java");
    System.out.println("map: "+map);
    map.replaceAll((key,value)->value.toUpperCase());
    System.out.println("map: "+map);

    HashMap<Integer, Integer> numbers = new HashMap<>();

    // insert entries to the HashMap
    numbers.put(5, 0);
    numbers.put(8, 1);
    numbers.put(9, 2);
    System.out.println("HashMap: " + numbers);

    // replace all value with the square of key
numbers.replaceAll((key,value)->key*key);
System.out.println("Numbers Hashmap: "+numbers);
}
    
}
