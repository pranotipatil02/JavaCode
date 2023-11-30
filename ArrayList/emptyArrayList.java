package ArrayList;
import java.util.ArrayList;
public class emptyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> n=new ArrayList<>();
        n.add(10);
        n.add(20);
        n.add(30);
        System.out.println("original list:"+n);
        ArrayList<Integer> n1=new ArrayList<>(n);
        System.out.println("copy list:"+n1);

        n.clear();
        System.out.println("after clear original list:"+n);
        n1.removeAll(n1);
        System.out.println("copy list after removeall:"+n1);
    }
    
}
