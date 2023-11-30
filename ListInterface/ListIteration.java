package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteration {
    public static void main(String[] args) {
        List l=new ArrayList<>();
        for(int i=1;i<=5;i++)
        {
            l.add(i);
        }
        System.out.println(l);
        System.out.println("iteration using loop");
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }
      
        System.out.println("\niteration using Iterator");

        Iterator it=l.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        
        System.out.println("\n iterating using object array");
        for (Object i : l) {
            System.out.print(i+" ");
        }
    }
    
}
