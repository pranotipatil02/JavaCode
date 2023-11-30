package Queue;

import java.util.PriorityQueue;


public class PriorityQToArray {
    public static void main(String[] args) {
        PriorityQueue<String> str=new PriorityQueue<>();
        str.offer("Welcome");
        str.offer("To");
        str.offer("this");
        str.offer("World");
        System.out.println("Priority queue: "+str);
        Object o[]=str.toArray();
        for (Object i : o) {
            System.out.println(i);
        }


        
    }
}
