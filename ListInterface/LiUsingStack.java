package ListInterface;

import java.util.List;
import java.util.Stack;

public class LiUsingStack {
    public static void main(String[] args) {
        List<Integer> l=new Stack<>();
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
