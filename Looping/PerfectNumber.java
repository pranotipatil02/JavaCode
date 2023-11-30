import java.util.Scanner;

public class PerfectNumber {
/*A number whose sum of factors (excluding the number itself) is equal to the number is called a perfect number. In other words, if the sum of positive divisors (excluding the number itself) of a number equals the number itself is called a perfect number. Let's understood it through an example. */
    public static void main(String[] args) {
            Scanner ob=new Scanner(System.in);

                int n,sum=0;
                System.out.println("enter number");
                n=ob.nextInt();

                for(int i=1;i<n;i++)
                {
                    if(n%i==0)
                    {
                        sum=sum+i;//0+1=1+2=2+3=6
                    }
                    
                }
                if(sum==n)
                {
                    System.out.println("Perfect number");
                }
                else
                {
                    System.out.println("Not a perfect number");
                }
}    
}
