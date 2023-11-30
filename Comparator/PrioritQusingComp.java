package Comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PrioritQusingComp  {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(new CustomComparator());
     pq.add(4);
     pq.add(2);
     pq.add(1);
     pq.add(3);
     
     System.out.println("Priority queue: "+pq);
    }
    
}
class CustomComparator implements Comparator<Integer>
{
public int compare(Integer n1,Integer n2)
{
    int value=n1.compareTo(n2);//4 2 1 3
    //4 2 3 1
    //4 3 2 1
    if(value>0)
    {
        return -1;//not swap
    }
    else if(value<0)
    {
        return 1;
    }
    else

    {
        return 0;//equal
    }
}
 
}
