import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class SpliteratorEx {
    public static void main(String[] args) {
              HashSet<String> hset=new HashSet<>(0);
        hset.add("kunal");
        hset.add("mohit");
        hset.add("sonal");
        hset.add("kunal");
        System.out.println("hashset: "+hset);
       
        Spliterator<String> splitex=hset.spliterator();
       splitex.forEachRemaining(System.out::print);
   
       Iterator it=hset.iterator();
       while(it.hasNext())
       {
        System.out.println(it.next());
       }
   
    }
    
}
