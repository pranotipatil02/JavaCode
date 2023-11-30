package Queue;
import java.util.Deque;
import java.util.ArrayDeque;

public class QusingArrayDeque {
    public static void main(String[] args) {
        Deque <Integer> adq=new ArrayDeque<>();
        adq.offer(10);
        adq.offer(20);
        adq.offer(30);
        adq.offerFirst(40);
    System.out.println("Deque: "+adq);//40 10 20 30
    System.out.println("peek: "+adq.peek());//40
    System.out.println("peekfirst: "+adq.peekFirst());//40
    System.out.println("peeklast: "+adq.peekLast());//30

    adq.offerLast(50);
    System.out.println("Deque: "+adq);//40 10 20 30 50
    adq.poll();
    System.out.println("Deque: "+adq);//40
    adq.pollLast();
    System.out.println("Deque: "+adq);//50
    
    


    }
    
}
