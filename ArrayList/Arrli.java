package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arrli {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        System.out.println("list:"+li.size());
        System.out.println("isempty: "+li.isEmpty());
        l.add(78);
        l.add(67);

        System.out.println("list l: "+l);
        li.add(10);//0->4
        li.add(20);
        li.add(30);
        li.add(40);
        
        li.add(0, 4);
        System.out.println("size: "+li.size());
        System.out.println("list: "+li);
        li.remove(2);
        System.out.println("list: "+li);
        System.out.println("contains:"+li.contains(20));
                System.out.println("contains:"+li.contains(30));
                System.out.println("size: "+li.size());
        System.out.println("isempty: "+li.isEmpty());
        li.clear();
        System.out.println("list: "+li);
        System.out.println("isempty: "+li.isEmpty());
        for(int i=1;i<=5;i++)
        {
            li.add(i);
        }
        System.out.println("list: "+li);
         li.remove(1);
        System.out.println("list: "+li);
         System.out.println("get: "+li.get(3));

        Iterator<Integer> iter=li.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }

        System.out.println("list: "+li);
        li.set(1, 77);
        System.out.println("list: "+li);
   System.out.println("change:");
        li.add(0, 6);
        System.out.println("list: "+li);
        li.set(1, 7);
        System.out.println("list: "+li);
         l.addAll(li);
         System.out.println("list: "+l);
    }
    
}
