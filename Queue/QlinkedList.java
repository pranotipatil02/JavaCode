package Queue;
import java.util.*;
import java.util.LinkedList;

public class QlinkedList {
    public static void main(String[] args) {
        Queue<Integer> ql=new LinkedList<>();
         ql.offer(1);
         ql.offer(2);
         ql.offer(3);
         System.out.println("queue: "+ql);
         
         int next=ql.peek();
         System.out.println("peek: "+next);

         int rem=ql.poll();
         System.out.println("remove: "+rem);

         System.out.println("updated queue: "+ql);
        }
    
}
