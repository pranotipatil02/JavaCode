package BlockingQ;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

class IteratorArrBlockingQ {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);

        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        
        System.out.println("ArrayBlockingQueue: " + animals);

        // Using peek()
        String element = animals.peek();
        System.out.println("Accessed Element: " + element);

        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        System.out.print("ArrayBlockingQueue Elements: ");

        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
