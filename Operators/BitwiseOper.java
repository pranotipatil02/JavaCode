import java.util.Scanner;

public class BitwiseOper {
    public static void main(String[] args) {
                Scanner ob=new Scanner(System.in);
                System.out.println("enter a and b value");
                int a=ob.nextInt();
                int b=ob.nextInt();
                //a=10 b=2

                System.out.println("a&b: "+(a&b));
                System.out.println("a|b: "+(a|b));
                System.out.println("a&b: "+(a^b));

                System.out.println("a<<b: "+(a<<b));
                System.out.println("a>>b: "+(a>>b));



    }
    
}
