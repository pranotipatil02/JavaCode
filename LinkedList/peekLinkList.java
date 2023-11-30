package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class peekLinkList {
    public static void main(String[] args) {
        LinkedList str=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 5 name you want to add: ");
        String name;
        for(int i=0;i<=4;i++)
        {
          name=sc.next();
           str.add(name);
        }
        System.out.println(str);
        System.out.println("str.peek(): "+str.peek());//fetch but does not remove
        System.out.println("str.peek(): "+str.peekFirst());
        System.out.println("str.peek(): "+str.peekLast());
        System.out.println("list: "+str);

    }
    
}
