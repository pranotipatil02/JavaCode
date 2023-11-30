import java.util.Scanner;

public class MultiplicatioOfDigit {
    public static void main(String[] args) {
          Scanner ob=new Scanner(System.in);
         int mod,multi=1;
          System.out.println("enter number");
                int number=ob.nextInt();

                while(number!=0)
                {
                    mod=number%10;
                    multi=multi*mod;//1*3=3*2=6*1=6
                    number=number/10;
                }
                System.out.println("Multiplication of Digit: "+multi);
    }
}
