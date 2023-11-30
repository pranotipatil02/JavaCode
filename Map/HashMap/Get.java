package Map.HashMap;

import java.util.HashMap;

public class Get {
    public static void main(String[] args) {
        HashMap<Integer, String> numbers = new HashMap<>();

    // insert entries to the HashMap
    numbers.put(1, "Java");
    numbers.put(2, "Python");
    numbers.put(3, "JavaScript");
    System.out.println("HashMap: " + numbers);

    // get the value
    System.out.println("get 2 key value: "+numbers.get(2)); 

    // create an HashMap
    HashMap<String, Integer> primeNumbers = new HashMap<>();

    // insert entries to the HashMap
    primeNumbers.put("Two", 2);
    primeNumbers.put("Three", 3);
    primeNumbers.put("Five", 5);
    System.out.println("HashMap: " + primeNumbers);

    // get the value
    int value = primeNumbers.get("Three");

    System.out.println("The key Three maps to the value: " + value);
  }
}



