package Queue;

import java.util.Queue;
import java.util.PriorityQueue;
public class QPriority
 {
    public static void main(String[] args) {
        //in priority element will not be sorted but it will be retrive in sorted order
        Queue<Integer> ql=new PriorityQueue<>();
         ql.offer(15);
         ql.offer(12);
         ql.offer(3);
         System.out.println("queue: "+ql);//3 15 12
         
         int next=ql.peek();
         System.out.println("peek: "+next);

         int rem=ql.poll();
         System.out.println("remove: "+rem);//3

         System.out.println("updated queue: "+ql);//12 15
    }
    
}
