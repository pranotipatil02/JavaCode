import java.util.Scanner;

public class ArmStrongSeries {
    /*An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits. */

    public static void main(String[] args) {
                Scanner ob=new Scanner(System.in);
                int r,sum,n,count=0;
                System.out.println("enter number and power value");
                int number=ob.nextInt();
                int power=ob.nextInt();
                for(int i=1;i<=number;i++)
                {
                    n=i;
                    sum=0;
                    while(n!=0)
                    {
                        r=n%10;
                        sum+=(Math.pow(n, power));//1
                        n=n/10;
                        
                        
                    }
                    if(sum==i)
                    {
                        System.out.println(i);
                    }
                    
                }
            }}
