package Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Item> priorityQueue = new PriorityQueue<>();

        // Enqueue elements with their priorities
        priorityQueue.add(new Item("Task 1", 2));
        priorityQueue.add(new Item("Task 2", 1));
        priorityQueue.add(new Item("Task 3", 3));//TASK 2,TASK 1,TASK3
         System.out.println("priority queue: "+priorityQueue);
        // Dequeue and print the highest-priority element
        System.out.println(priorityQueue.poll());  // Output: Task 2

        // Peek and print the highest-priority element
        System.out.println(priorityQueue.peek());  // Output: Task 1

        // Check if the priority queue is empty
        System.out.println(priorityQueue.isEmpty());  // Output: false

        // Get the size of the priority queue
        System.out.println(priorityQueue.size());  // Output: 2
    }
}

class Item implements Comparable<Item> {
    private String name;
    private int priority;//<T>

   

    public Item(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Item other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return name;
    }
}
/*
swapping concept
 v1>v2 : return 1 -swap  45 >34 
 v1<v2: return -1 -not swap  //23<30
 v1==v2 :- return 0  
 */
