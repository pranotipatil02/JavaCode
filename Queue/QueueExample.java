package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the Queue
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        // Displaying the Queue
        System.out.println("Queue: " + queue);

        // Removing elements from the Queue
        String removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);

        // Displaying the updated Queue
        System.out.println("Updated Queue: " + queue);

        // Accessing the element at the front of the Queue
        String frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        // Checking if the Queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the Queue empty? " + isEmpty);
    }
}

