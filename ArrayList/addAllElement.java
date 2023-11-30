package ArrayList;
import java.util.ArrayList;
public class addAllElement {
    public static void main(String[] args) {
        ArrayList<Integer> n=new ArrayList<Integer>();
        n.add(10);
        n.add(20);
        n.add(30);
        System.out.println("Original list n:"+n);
        ArrayList<Integer> n1=new ArrayList<>();
        System.out.println("empty: "+n1.isEmpty());
        n1.addAll(n);
        System.out.println("Copied list n1:"+n1);
                System.out.println("empty: "+n1.isEmpty());

    
    }
    
}
