import java.util.HashSet;

public class RemovHashset {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<String>();  
           set.add("Ravi");  
           set.add("Vijay");  
           set.add("Arun");  
           set.add("Sumit");  
           System.out.println("An initial list of elements: "+set);  
        set.remove("Ravi");
        System.out.println();
        System.out.println("set after remove: "+set);
         HashSet<String> set1=new HashSet<String>();  
           set1.add("Ajay");  
           set1.add("Gaurav");  
        set.addAll(set1);
        System.out.println("update set: "+set);
          
          set.clear();
          System.out.println("after clear: "+set);
          System.out.println(set1);
        }
    
}
