package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class ListCopyOf {
    public static void main(String[] args) {
        ArrayList<Integer> n=new ArrayList<>();
        n.add(10);
        n.add(20);
        n.add(30);
        System.out.println("original list:"+n);
        ArrayList<Integer> n1=new ArrayList<>(List.copyOf(n));
        System.out.println("copy list:"+n1);

    }
    
}
