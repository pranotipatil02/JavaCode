package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQComparator {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue<>();
        for(int i=5;i>=1;i--)
        {
            pq.offer(i);//5 4 3 2 1
        }
        System.out.println("PriorityQueue: "+pq);
        //comparator check pq follow natural order so it return null
      Comparator com=pq.comparator();
      System.out.println("comparator value is: "+com);
    }
    
}
