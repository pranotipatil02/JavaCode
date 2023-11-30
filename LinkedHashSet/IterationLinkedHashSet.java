package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class IterationLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("One"); 
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        
        Iterator it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
}
