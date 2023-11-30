import java.util.Scanner;

public class ReverseOfDigit {  //124  :-421
    public static void main(String[] args) {
         Scanner ob=new Scanner(System.in);
         int mod;
          System.out.println("enter number");
                int number=ob.nextInt();
                 //123
                while(number!=0)
                {
                    mod=number%10;//3//2
                    System.out.print(mod);//3 2 1
                    number=number/10;//12//1
                }
    }
    
}
