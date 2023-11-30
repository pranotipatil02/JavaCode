package ArrayList;

import java.util.*;
import java.util.ArrayList;

public class arrayOfArraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int size=sc.nextInt();
        ArrayList<ArrayList<Integer>> aList=new ArrayList<ArrayList<Integer>>(size);
        
        ArrayList a1=new ArrayList();
        a1.add(1);
        a1.add(2);
        //a1 1,2
        System.out.println("a1:"+a1);
        aList.add(a1);
        //alist 1,2
        System.out.println("aList:"+aList);
        ArrayList a2=new ArrayList();
        a2.add(5);
        //a2 5
        System.out.println("a2:"+a2);
        aList.add(a2);
        //alist 1,2,5
        System.out.println("alist:"+aList);
        ArrayList a3=new ArrayList();
        a3.add(10);
        a3.add(20);
        a3.add(40);
        //a3 10,20,30
        System.out.println("A3:"+a3);
        aList.add(a3);
        System.out.println("aList:"+aList);
       System.out.println("alist: "+aList.size());
        for(int i=0;i<aList.size();i++)
        {
            for(int j=0;j<aList.get(i).size();j++)
            {
              System.out.print(aList.get(i).get(j)+" ");
            }
            System.out.println();
        }
       

    }
    
}
