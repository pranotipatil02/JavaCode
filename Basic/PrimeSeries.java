package Basic;

import java.util.Scanner;

public class PrimeSeries {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        
        System.out.println("enter n value");
        int n=obj.nextInt();
       
        // Declaring the variables
        int x, y, flg;
 
        // Printing display message
        System.out.println(
            "All the Prime numbers within 1 and " + n
            + " are:");
 
        // Using for loop for traversing all
        // the numbers from 1 to N
        for (x = 1; x <= n; x++) {
 
            // Omit 0 and 1 as they are
            // neither prime nor composite
            if (x == 1 || x == 0)
                continue;
 
            // Using flag variable to check
            // if x is prime or not
            flg = 1;
 
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
 
            // If flag is 1 then x is prime but
            // if flag is 0 then x is not prime
            if (flg == 1)
                System.out.print(x + " ");
        }
    }
    
}
