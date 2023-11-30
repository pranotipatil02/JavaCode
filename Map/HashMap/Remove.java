package Map.HashMap;

import java.util.HashMap;

public class Remove {
    public static void main(String[] args) {
        // create a HashMap
    HashMap<Integer, String> languages = new HashMap<>();

    // add mappings to HashMap
    languages.put(1, "Python");
    languages.put(2, "C");
    languages.put(3, "Java");
    System.out.println("Languages: " + languages);

    // remove the mapping with key 2
    languages.remove(2);  // return C

    System.out.println("Updated Languages: " + languages);
    }
}
