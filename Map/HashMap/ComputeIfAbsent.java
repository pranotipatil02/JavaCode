package Map.HashMap;

import java.util.HashMap;

public class ComputeIfAbsent {
    public static void main(String[] args) {
      // create an HashMap
    HashMap<String, Integer> prices = new HashMap<>();

    // insert entries to the HashMap
    prices.put("Shoes", 200);
    prices.put("Bag", 300);
    prices.put("Pant", 150);
    System.out.println("HashMap: " + prices);

    // compute the value of Shirt   
    int shirtValue=prices.computeIfAbsent("Shirt", (key)->120);
   System.out.println("shirt value: "+shirtValue);

   int bagNewValue=prices.computeIfAbsent("Bag", (key)->800);
  System.out.println("bag new value: "+prices);
}
    
}
