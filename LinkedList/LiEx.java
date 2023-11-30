package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LiEx {
    public static void main(String[] args) {
        LinkedList li=new LinkedList<>();
        
        for(int i=1;i<=5;i++)
        {
            li.add(i);
        
        }

        Iterator it=li.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
}
