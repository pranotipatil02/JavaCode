package ListInterface;

import java.util.Vector;
import java.util.*;
public class LiUsingVector {
    public static void main(String[] args) {
        List<Integer> l=new Vector<>();
        System.out.println(l.size());
        for(int i=1;i<=10;i++)
        {
            l.add( i);
        }
        System.out.println(l);
        System.out.println(l.size());
        l.add(23);
                System.out.println(l.size());


        l.remove(2);
        
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }
    }
    
}
