package Queue;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueImplement {
    public static void main(String[] args) {
        Queue<Integer> adq=new ArrayDeque<>();
        adq.offer(5);
        adq.add(2);
        adq.offer(7);
        adq.offer(9);
        System.out.println("ArrayDeque: "+adq);
        System.out.println("Peek: "+adq.peek());
        adq.poll();
        System.out.println("poll: "+adq);
        Queue<Integer> pq=new PriorityQueue<>();
        pq.offer(5);
        pq.add(2);
        pq.offer(7);
        pq.offer(9);
        System.out.println("Priority queue: "+pq);
        System.out.println("Peek: "+pq.peek());
        pq.poll();
        System.out.println("poll: "+pq);
        Queue<Integer> qli=new LinkedList<>();
        qli.offer(5);
        qli.add(2);
        qli.offer(7);
        qli.offer(9);
        System.out.println("LinkedList: "+qli);
        System.out.println("Peek: "+qli.peek());
        qli.poll();
        System.out.println("poll: "+qli);
        
    }
    
}
