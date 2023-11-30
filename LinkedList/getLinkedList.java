package LinkedList;

import java.util.LinkedList;

public class getLinkedList {
    public static void main(String[] args) {
          LinkedList<Integer>li=new LinkedList<>();
        li.add(34);
        li.add(20);
        li.add(56);
        li.add(34);
        li.add(78);
        System.out.println("list:"+li);
        System.out.println("get index 2: "+li.get(2));
        System.out.println("getFirst: "+li.getFirst());
        System.out.println("getLast: "+li.getLast());
        

    }
    
}
