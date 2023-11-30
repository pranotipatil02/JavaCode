package LinkedList;

import java.util.LinkedList;

public class linkListEX {
    public static void main(String[] args) {
        
    LinkedList<Integer>  num=new LinkedList<>();        
    System.out.println("size of link list:"+num.size());
    for(int i=1;i<5;i++)
    {
       num.add(i);
    }
    System.out.println("linked list: "+num);
    num.remove(0);
    System.out.println("after remove 0 index: "+num);
    for(int j=0;j<num.size();j++)
    {
        System.out.print(num.get(j)+" ");
    }
}
    
}
