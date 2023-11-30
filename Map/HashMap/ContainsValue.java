package Map.HashMap;

import java.util.HashMap;

public class ContainsValue {
    public static void main(String[] args) {
      // create a HashMap
    HashMap<String, String> countries = new HashMap<>();

    // add mappings to HashMap
    countries.put("Washington", "USA");
    countries.put("Canberra", "Australia");
    System.out.println("HashMap:\n" + countries);

    // check if the value Spain is present
    if(!countries.containsValue("Spain")) {
      // add entry if Value already not present
      countries.put("Madrid", "Spain");
    }

    System.out.println("Updated HashMap:\n" + countries);
  
    }
}
