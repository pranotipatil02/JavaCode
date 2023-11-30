package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AddMethods {
public static void main(String[] args) {

    List li=new LinkedList<>();
    li.add("kunal");
    li.add("rahul");
    li.add(10);
    li.add(5.6);
    Iterator iter=li.iterator();
    while(iter.hasNext())
    {
        System.out.println(iter.next());
    }
}    
}
