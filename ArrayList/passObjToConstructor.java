package ArrayList;
import java.util.ArrayList;
public class passObjToConstructor {
    public static void main(String[] args) {
        ArrayList<Integer> n=new ArrayList<Integer>();
        n.add(10);
        n.add(20);
        n.add(30);
        System.out.println("First list n:"+n);

        ArrayList<Integer> n1=new ArrayList<Integer>(n);
        System.out.println("second list n1:"+n1);
        n1.set(0, 40);

        System.out.println(" list after set n1:"+n1);


    }
}
