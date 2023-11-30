package Queue;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        // Create a Priority Queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the Priority Queue
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(20);

        // Displaying the Priority Queue
        System.out.println("Priority Queue: " + priorityQueue);

        // Removing elements from the Priority Queue
        int removedElement = priorityQueue.poll();
        System.out.println("Removed element: " + removedElement);

        // Displaying the updated Priority Queue
        System.out.println("Updated Priority Queue: " + priorityQueue);

        // Accessing the element with the highest priority
        int highestPriorityElement = priorityQueue.peek();
        System.out.println("Element with highest priority: " + highestPriorityElement);

        // Checking if the Priority Queue is empty
        boolean isEmpty = priorityQueue.isEmpty();
        System.out.println("Is the Priority Queue empty? " + isEmpty);
    }
}
