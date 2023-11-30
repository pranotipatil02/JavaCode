package BlockingQ;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQ {
  public static void main(String[] args) {
    // Create a blocking queue using the ArrayBlockingQueue
      BlockingQueue<Integer> numbers = new ArrayBlockingQueue<>(5);

      try {
        // Insert element to blocking queue
        numbers.put(2);//wait if no space is there
        numbers.put(1);
        numbers.put(3);
        System.out.println("BLockingQueue: " + numbers);

        // Remove Elements from blocking queue
        int removedNumber = numbers.take();//remove and if there is no element then wait for next element to be inserted
        System.out.println("Removed Number: " + removedNumber);
      }

      catch(Exception e) {
          e.getStackTrace();
      }
  }  
}
