package Basic;
import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        //name,rollno,marks
        System.out.println("Enter Name: ");
        String name=obj.next();
        System.out.println("Enter rollno: ");
        int rollno=obj.nextInt();
        System.out.println("Enter Marks");
        float marks=obj.nextFloat();
        System.out.println("Name: "+name);
        System.out.println("Rollno: "+rollno);
        System.out.println("Marks: "+marks);
        
        

    }
}
