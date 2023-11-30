package LinkedList;

import java.util.LinkedList;
/*Java’s Linked list class offers a function that allows a “Queue Based” working called poll(). This function not only returns deletes the first element, but also displays them while being deleted and hence can have a lot of usage in daily life problems and competitive programming as well. */
public class PollLinkedList {
    //poll retrives and remove
    public static void main(String[] args) {
         LinkedList<Integer>li=new LinkedList<>();
        li.add(34);
        li.add(20);
        li.add(56);
        li.add(12);
        li.add(78);
        System.out.println("list:"+li);
        System.out.println("head poll remove list: "+li.poll());
        System.out.println("list: "+li);

        System.out.println("pollFirst: "+li.pollFirst());
        System.out.println("list: "+li);

        System.out.println("pollLast: "+li.pollLast());
        System.out.println("List: "+li);

    }
    
}
