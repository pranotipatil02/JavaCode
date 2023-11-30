package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Integer> li=new LinkedList<>();
       Scanner sc=new Scanner(System.in);
       System.out.println("enter n value");
       int n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
           li.add(i);
       }

       Iterator i=li.iterator();
       
       while(i.hasNext())
       {
         System.out.println(i.next());
       }
       li.add(2, 67);
       System.out.println("list: "+li);

       li.set(3, 45);
      
       System.out.println("list: "+li);
       

    }
    
}
