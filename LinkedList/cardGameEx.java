package LinkedList;

import java.util.LinkedList;

public class cardGameEx {
    public static void main(String[] args) {
        LinkedList o=new LinkedList<>();
        o.add(9);
        o.add(2);
        o.add("King");
        o.add(5);
        o.add("Jack");
        String str="Upper";
        System.out.println("list: "+o);
        System.out.println(o.get(0));
        System.out.println(o.getFirst());
        System.out.println(o.getLast());
        if(str=="upper")
        {
            System.out.println("peek upper:"+o.peekFirst());
        }
        else
        
        {
            System.out.println("peek lower:"+o.peekLast());
  
        }
    }
}
