package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();  
           ll.add("Ravi");  
           ll.add("Vijay");  
           ll.add("Ajay");  


        LinkedList l=new LinkedList<>();
        for(int i=1;i<=5;i++)
        {
            l.add(i);
        }


        Iterator it=l.descendingIterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        
           System.out.println("order iterator: ");
           Iterator<String> iter1=ll.iterator();
           while(iter1.hasNext())
           {
            System.out.println(iter1.next());
           }
           Iterator<String> iter2=ll.descendingIterator();
           while(iter2.hasNext())
           {
            System.out.println(iter2.next());
           }
    }
}
