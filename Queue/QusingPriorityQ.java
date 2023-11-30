package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QusingPriorityQ {
    public static void main(String[] args) {
        var pq=new PriorityQueue<Integer>();
        //always take min heap first value would be min value
        //else oreder can be anything
        pq.offer(50);
        pq.offer(30);
        pq.offer(20);
        pq.offer(40);
        pq.add(10);
        System.out.println("Pqueue: "+pq);//min top item 10
        System.out.println("peek: "+pq.peek());

        PriorityQueue<Integer> pqMax=new PriorityQueue<>(Comparator.reverseOrder());
        pqMax.offer(10);
        pqMax.offer(3);
        pqMax.offer(20);
        pqMax.offer(4);
        pqMax.add(70);
        System.out.println("max priority:"+pqMax);// first max element
        System.out.println("peek: "+pqMax.peek());

    }
    
}
