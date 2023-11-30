package LinkedList;

import java.util.LinkedList;

public class AddFirstLast {
    public static void main(String[] args) {
        LinkedList<Integer>li=new LinkedList<>();
        li.add(34);
        li.add(20);
        li.add(56);
        li.add(12);
        li.add(78);
        System.out.println("list:"+li);
        li.addFirst(70);
        li.addLast(89);
        li.add(1, 77);
        li.addAll(li);
    
        System.out.println("list: "+li);
    }
    
}
