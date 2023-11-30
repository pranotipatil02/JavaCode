import java.util.Scanner;

public class Factorial {
    /*The factorial of a positive number n is given by:
factorial is a product of all ascending and descending order digit
factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n */
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int fact=1;
        System.out.println("enter number");
        int number=ob.nextInt();
        for(int i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial: "+fact);
        ob.close();
    }
}

