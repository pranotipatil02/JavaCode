package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOperation {
    public static void main(String[] args)
     {
    
        LinkedList<Integer> num=new LinkedList<>();
        //add
        
        for(int i=1;i<=5;i++)
        {
            num.add(i);
        }    
        System.out.println("list:"+num);//[1,2,3,4,5]
        num.set(0, 10);
        System.out.println("set list:"+num);
        num.add(1, 20);
        System.out.println("after add index 1 list:"+num);
        System.out.println(num);
        num.remove(1);
        System.out.println(num);
        num.addFirst(30);
        System.out.println(num);
        num.addLast(60);
        System.out.println(num);
        System.out.println("contains:"+num.contains(60));
      System.out.println("descending order:");
      Iterator<Integer> it=num.descendingIterator();
      while(it.hasNext())
      {
        System.out.println(it.next());
      }
      

        System.out.println(num);
       System.out.println("num.getFirst(): "+num.getFirst());
       System.out.println("num.getLast(): "+num.getLast());
       System.out.println("num.isEmpty(): "+num.isEmpty());
       System.out.println("num.lastIndexOf(5)"+num.lastIndexOf(88));
       num.removeFirst();
       System.out.println(num);
       num.removeLast();
       System.out.println(num);
      for(int i=0;i<num.size();i++)
      {
        System.out.print(num.get(i)+" ");
      }

      System.out.println("\niterating through foreach");
   for (Integer i : num) {
    System.out.print(i+" ");
   }

   System.out.println("\nsize:"+num.size());
    }
    
}
