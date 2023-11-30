package Map.HashMap;

import java.util.HashMap;

public class Getdefault {
    public static void main(String[] args) {
         HashMap<Integer, String> numbers = new HashMap<>();

        // insert entries to the HashMap
        numbers.put(1, "Java");
        numbers.put(2, "Python");
        numbers.put(3, "JavaScript");
        System.out.println("HashMap: " + numbers);

        // mapping for the key is present in HashMap
    String getDefa=numbers.getOrDefault(2, "not found");
    System.out.println("value for key 2: "+getDefa);


    String getValue=numbers.getOrDefault(5, "not found");
    System.out.println("value for key 5: "+getValue);
    

}
}
