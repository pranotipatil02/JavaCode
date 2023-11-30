package Map.HashMap;

import java.util.HashMap;

public class Compute {
    public static void main(String[] args) {
     HashMap<String, Integer> prices = new HashMap<>();

    // insert entries to the HashMap
    prices.put("Shoes", 200);
    prices.put("Bag", 300);
    prices.put("Pant", 150);
    System.out.println("HashMap: " + prices);

    // recompute the value of Shoes with 10% discount   
  int returnValue=prices.compute("Shoes", (key,value)->value-value*10/100);
System.out.println("shoes 10 %: "+returnValue);

}
    
}
