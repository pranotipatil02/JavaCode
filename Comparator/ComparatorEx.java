package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
    public static void main(String[] args) {//T: INDICATE TYPE 
        Comparator<Integer> com=new Comparator<Integer>() {
            public int compare(Integer num1,Integer num2)
            {
              if(num1%10 >num2%10)//based on last digit sort 43 >31
              {
                return 1;//swap  31 43 72 29:-31 72 43 29:- 
              }
              else
              {
                return -1;//not swap
              }
            }
        };


        List<Integer> li=new ArrayList<>();
        li.add(43);
        li.add(31);
        li.add(72);
        li.add(29);
       Collections.sort(li,com);//if u want to sort based on your logic u need to pass comparator object
      System.out.println("elements: "+li);//elements: [31, 72, 43, 29]
    }
    
}
