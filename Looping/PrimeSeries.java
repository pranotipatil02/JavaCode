import java.util.Scanner;

public class PrimeSeries {
       /*A prime number is defined as a natural number greater than 1 and is divisible by only 1 and itself.  */
//1----1000
    public static void main(String[] args) {
           Scanner ob=new Scanner(System.in);
        int i,n,m=0,number,flag;
        System.out.println("enter number value");
         number=ob.nextInt();

         for(i=1;i<=number;i++)//n=10
         {
            n=i;flag=0;
             if(n==1 || n==0)
             {
              flag=1;
             }
             else
             {
                for(int j=2;j<=n/2;j++)
             {
                
                if(n%j==0)
                {
                    flag=1;
                    break;
                }


                
            }
            
             }
            if(flag==0)
            {
                System.out.println(n);
            }
        }
    
}
}