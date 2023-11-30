import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetFromAnother {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
           arr.add("Ravi");  
           arr.add("Vijay");  
           arr.add("Arun");  
           arr.add("Sumit");  
           System.out.println("An initial list of elements: "+arr);
           HashSet<String> set=new HashSet<String>(arr);

        Iterator iter=set.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
          System.out.println("set: "+set);
    }
    
}
