package ArrayList;
import java.util.ArrayList;
public class ArrayListClone {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<String>();
        str.add("Kunal");
        str.add("Mohit");
        str.add("Sahil");
        System.out.println("First list:"+str);
        ArrayList<String> st=new ArrayList<String>();
        //st=(ArrayList)str.clone();
        st=(ArrayList)str.clone();
        System.out.println("Second copy list:"+st);
   
    }
    
    
}
