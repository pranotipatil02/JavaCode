package ListInterface;

import java.util.LinkedList;
import java.util.*;

public class LiUsingLinkedlist {
    public static void main(String[] args) {
        List<Integer> l=new LinkedList<>();
        for(int i=1;i<=5;i++)
        {
            l.add( i);
        }
        System.out.println(l);
        l.remove(2);
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }
    }
    
}
