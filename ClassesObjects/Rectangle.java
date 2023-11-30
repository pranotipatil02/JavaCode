
import java.util.Scanner;
import Basic.*;
public class Rectangle {
    //area=l*b
    int length,breadth,area;
   void findArea()
   {
    area=length*breadth;
    System.out.println("Reactangle area: "+area);
   }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Rectangle obj=new Rectangle();
    System.out.println("enter length and breadth value");
    //l=sc.nextInt();
    //b=sc.nextInt();
    
     obj.length=sc.nextInt();
    obj.breadth=sc.nextInt();
    
    obj.findArea();
}
    
}
