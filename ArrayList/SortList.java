package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {
    public static void main(String[] args) {
        ArrayList<Integer> li =new ArrayList<>();
        li.add(50);
        li.add(40);
        li.add(30);
        li.add(20);
        li.add(10);
        System.out.println("list: "+li);
        Collections.sort(li);
        System.out.println("sort list: "+li);
        

    }
    
}
