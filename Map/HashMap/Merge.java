package Map.HashMap;

import java.util.HashMap;

public class Merge {
    public static void main(String[] args) {
        HashMap<String, Integer> prices = new HashMap<>();

    // insert entries to the HashMap
    prices.put("Shoes", 200);
    prices.put("Bag", 300);
    prices.put("Pant", 150);
    System.out.println("HashMap: " + prices);
    int returnValue=prices.merge("Shirt", 100, (oldvalue,newvalue)->oldvalue+newvalue);
    System.out.println("price of shirt: "+returnValue);
    System.out.println("prices: "+prices);
    

}
    
}
