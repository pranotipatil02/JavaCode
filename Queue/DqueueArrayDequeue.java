package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DqueueArrayDequeue
 {
    public static void main(String[] args) 
    {
        // Creating Deque using the ArrayDeque class
        Deque<Integer> numbers = new ArrayDeque<>();

        // add elements to the Deque
        numbers.offer(1);
        numbers.offerLast(2);
        numbers.offerFirst(3);
        System.out.println("Deque: " + numbers);//3 1 2

        // Access elements of the Deque
        int firstElement = numbers.peekFirst();//3
        System.out.println("First Element: " + firstElement);

        int lastElement = numbers.peekLast();//2
        System.out.println("Last Element: " + lastElement);

        // Remove elements from the Deque
        int removedNumber1 = numbers.pollFirst();//3
        System.out.println("Removed First Element: " + removedNumber1);

        int removedNumber2 = numbers.pollLast();//2
        System.out.println("Removed Last Element: " + removedNumber2);

        System.out.println("Updated Deque: " + numbers);

    }
}
