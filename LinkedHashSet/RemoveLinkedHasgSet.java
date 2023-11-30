package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveLinkedHasgSet {
    public static void main(String[] args) {
      LinkedHashSet<String> lhs = new LinkedHashSet<String>();    
    
      lhs.add("learn");
      lhs.add("java");
      lhs.add("python");
      lhs.add("easily");
      System.out.println(lhs);

      lhs.remove("python");
     System.out.println(lhs);

       Iterator it=lhs.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
    
}
