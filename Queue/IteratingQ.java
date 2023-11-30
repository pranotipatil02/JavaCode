package Queue;
import java.util.*;
//import java.util.Iterator;


public class IteratingQ {
    public static void main(String[] args) {
        Queue<String> name=new PriorityQueue<>();
        name.offer("Kunal");
        name.offer("Shital");
        name.offer("Mohit");
        name.offer("Rashi");
        Iterator iter=name.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
    
}
