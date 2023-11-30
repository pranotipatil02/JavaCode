import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(15);
        numbers.add(200);
        numbers.add(30);
        

        List<Integer>  sort=numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted: "+sort);

        // Example 1: Stream operations with ArrayList
        System.out.println("Original ArrayList: " + numbers);

        // Using forEach to print each element
        System.out.println("Using forEach:");
        numbers.stream().forEach(System.out::println);

        // Using filter to filter elements greater than 15
        List<Integer> filteredList = numbers.stream()
                .filter(num -> num > 15)
                .collect(Collectors.toList());
        System.out.println("Filtered elements: " + filteredList);

        // Using map to double each element
        List<Integer> doubledList = numbers.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
        System.out.println("Doubled elements: " + doubledList);

        // Using reduce to calculate the sum of all elements
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of elements: " + sum);


       
    }
}
