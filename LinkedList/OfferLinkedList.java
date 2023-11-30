package LinkedList;

import java.util.LinkedList;

public class OfferLinkedList {
    public static void main(String[] args) {
         LinkedList<Integer>li=new LinkedList<>();
        li.add(34);
        li.add(20);
        li.add(56);
        li.add(12);
        li.add(78);

        System.out.println("list:"+li);
        System.out.println("offer tail"+li.offer(23));    
        System.out.println("list:"+li);
        System.out.println("offerFirst(7):"+li.offerFirst(7));
        System.out.println("list:"+li);
        System.out.println("offer last: "+li.offerLast(89));
        System.out.println("list:"+li);


    }
    
}
