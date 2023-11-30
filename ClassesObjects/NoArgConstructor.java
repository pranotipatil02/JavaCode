import java.util.Scanner;


public class NoArgConstructor {


static int length,breadth,area;
 
 NoArgConstructor()
   {
    
    Scanner sc = new Scanner(System.in); 
    System.out.println("enter length and breadth value");
    length=sc.nextInt();
    breadth=sc.nextInt();
    area=length*breadth;
    System.out.println("Reactangle area: "+area);
   }

    public static void main(String[] args) {

        
            NoArgConstructor obj=new NoArgConstructor();

           


    }
}
