import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) {
        List<String> li=new ArrayList<>();
        System.out.println("size: "+li.size());
        li.add("apple");
        li.add("mango");
        li.add("banana");

        Iterator<String> it=li.iterator();
        while(it.hasNext())
        {
            String element=it.next();
            System.out.println(element);
        }
        System.out.println("size: "+li.size());
        System.out.println("Remove element");

        Iterator<String> iterator=li.iterator();
        while(iterator.hasNext())
        {
            String item=iterator.next();

            if(item.equals("mango"))
            {
                iterator.remove();
            }
           

        }
         System.out.println(li);
        System.out.println("size: "+li.size());

    }
    
}
