package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listMethods {
    public static void main(String[] args) {
        List<Integer> n=new ArrayList<>();
        System.out.println("size:"+n.size());
        n.add(1);
        for(int i=2;i<=5;i++)
        {
            n.add(i);
        }
        System.out.println("list: "+n);
        System.out.println("size:"+n.size());
         n.add(0, 10);
         System.out.println("list: "+n);
        System.out.println("contains: "+n.contains(5));
        n.set(1, 20);
        System.out.println("list: "+n);
        n.remove(0);
        System.out.println("list: "+n);
        n.remove(3);
        System.out.println("list: "+n);
       System.out.println("get 0 index :"+n.get(0));
       
       List<Integer> n1=new ArrayList<>();
       for(int i=10;i<=15;i++)
        {
            n1.add(i);
        }
        n.addAll(0, n1);
        System.out.println("n1: "+n1);
        System.out.println("n: "+n);
        System.out.println("get 1 index :"+n.get(1));
        
        Iterator it=n.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }

        n.add(10);
        n.add(10);
         n.add(10); 
        n.add(10);
        System.out.println("n: "+n);
        System.out.println("index of 10:"+n.indexOf(10));
        System.out.println("last occurindex of 10:"+n.lastIndexOf(10));
        System.out.println("Equals: "+n.equals(n1));
        System.out.println("isEmpty: "+n.isEmpty());
        System.out.println("containsAll: "+n.containsAll(n1));
       n.sort(null);
       System.out.println(n);
    }
    
}
