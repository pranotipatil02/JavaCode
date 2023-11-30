package BlockingQ;

import java.util.concurrent.ArrayBlockingQueue;

public class PutEx {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(2);

       try {
        // Add elements to animals
           animals.put("Dog");
           animals.put("Cat");

           System.out.println("ArrayBlockingQueue: " + animals);
                      animals.put("Cow");

           animals.take();
           System.out.println("ArrayBlockingQueue: " + animals);

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
