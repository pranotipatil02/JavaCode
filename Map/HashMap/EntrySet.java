package Map.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class EntrySet {
    public static void main(String[] args) {
       // create an HashMap
    HashMap<String, Integer> prices = new HashMap<>();

    // insert entries to the HashMap
    prices.put("Shoes", 200);
    prices.put("Bag", 300);
    prices.put("Pant", 150);
    System.out.println("HashMap: " + prices);

    // return set view of mappings
    System.out.println("Set View: " + prices.entrySet()); 

    
    //foreach loop

    for(Entry<String,Integer> entry:prices.entrySet())
    {
        System.out.print(entry+" ");
    }



}
    
}
