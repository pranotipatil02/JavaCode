package Map.HashMap;

import java.util.HashMap;

public class ContainsKey {
    public static void main(String[] args) {
     // create a HashMap
    HashMap<String, String> countries = new HashMap<>();

    // add mappings to HashMap
    countries.put("USA", "Washington");
    countries.put("Australia", "Canberra");
    System.out.println("HashMap:\n" + countries);

    // check if key Spain is present
    if(!countries.containsKey("Spain")) {
      // add entry if key already not present
      countries.put("Spain", "Madrid");
    }

    System.out.println("Updated HashMap:\n" + countries);   
    }
}
