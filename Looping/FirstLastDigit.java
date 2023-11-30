import java.util.Scanner;

public class FirstLastDigit {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
                  int last,first=0;

        System.out.println("enter number");
                int number=ob.nextInt();
                last=number%10;
                while(number!=0)
                {
                  first=number%10;
                  number=number/10;
                }
                System.out.println("First digit: "+first+" Last digit: "+last);
    }
}
