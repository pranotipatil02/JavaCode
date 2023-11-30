package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(34);
        li.add(23);
        li.add(56);
        li.add(12);
         li.add(34);
          li.add(34);
        System.out.println("Min: "+Collections.min(li));
        System.out.println("Max: "+Collections.max(li));
        System.out.println("Frequencey: "+Collections.frequency(li, 34));//repetition
    Collections.sort(li);
    System.out.println("sort: "+li);

Collections.sort(li,Comparator.reverseOrder());
System.out.println("reverse sort: "+li);
}
    
}
