package Map.HashMap;

import java.util.HashMap;

public class ForEach {
    public static void main(String[] args) {
        // create a HashMap
    HashMap<String, Integer> prices = new HashMap<>();

    // insert entries to the HashMap
    prices.put("Shoes", 200);
    prices.put("Bag", 300);
    prices.put("Pant", 150);
    System.out.println("Normal Price: " + prices);

    System.out.print("Discounted Price: ");
    
    prices.forEach((key,value)->{
        value=value-value*10/100;
        System.out.println(key+" "+value+" ");
    });

}
    
}
