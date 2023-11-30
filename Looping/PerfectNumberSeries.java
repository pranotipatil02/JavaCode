import java.util.Scanner;

public class PerfectNumberSeries {
    public static void main(String[] args) {
      /*A number whose sum of factors (excluding the number itself) is equal to the number is called a perfect number.
       In other words, if the sum of positive divisors (excluding the number itself) 
       of a number equals the number itself is called a perfect number.
         */
      /*ex 6 check all digit less then 6 divisible by a given number if it is divisible then add that value if addition of this value equal to given value than it would be your perfect number */  
      Scanner ob=new Scanner(System.in);

                int n,sum,number;
                System.out.println("enter number");
                number=ob.nextInt();//6,28,496
                for(int i=1;i<=number;i++)
                {
                  n=i;
                  sum=0;
                  for(int j=1;j<n;j++)
                  {
                    if(n%j==0)
                    {
                        sum=sum+j;
                    }
                  }
                  if(sum==i)
                  {
                    System.out.println(i);
                  }
                


                }
    }
    
}
