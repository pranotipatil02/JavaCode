package LinkedList;

import java.util.LinkedList;

public class LastIndex {
    public static void main(String[] args) {
         LinkedList<Integer>li=new LinkedList<>();
        li.add(34);
        li.add(20);
        li.add(56);
        li.add(34);
        li.add(78);
        System.out.println("list:"+li);
        System.out.println("last occurence: "+li.lastIndexOf(34));
        System.out.println("remove last occurence: "+li.removeLastOccurrence(34));
       System.out.println("list: "+li);
    }
    
}
