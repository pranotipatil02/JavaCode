import java.util.HashSet;
import java.util.Iterator;

public class IteratorEx
{
    public static void main(String[] args) {
        HashSet<String> hset=new HashSet<>(0);
        hset.add("kunal");
        hset.add("mohit");
        hset.add("sonal");
        hset.add("kunal");
        System.out.println("hashset: "+hset);
        Iterator<String> iter=hset.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}