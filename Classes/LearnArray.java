package Classes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LearnArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        
        int index=Arrays.binarySearch(a,4);
    System.out.println("index: "+index);

    Integer arr[]={45,23,10,34,77,62};
   for(Object o:arr)
   {
    System.out.println(o);
   }
    Arrays.sort(arr);
   System.out.println("After sort: ");
     for(Integer i:arr)
   {
    System.out.println(i);
   }
   
   Arrays.fill(arr, 12);
   System.out.println("after fill 12: ");
     for(Integer j:arr)
   {
    System.out.println(j);
   }       

}

    
}
