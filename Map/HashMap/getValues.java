package Map.HashMap;

import java.util.HashMap;

public class getValues {
    public static void main(String[] args) {
        // create an HashMap
    HashMap<String, Integer> prices = new HashMap<>();

    // insert entries to the HashMap
    prices.put("Shoes", 200);
    prices.put("Bag", 300);
    prices.put("Pant", 150);
    System.out.println("HashMap: " + prices);

    // return view of all values
    System.out.println("Values: " + prices.values());
    
for(int i:prices.values())
{
    System.out.print(i+" ");
}

}
    
}
