import java.util.Scanner;

public class Prime {
   /*A prime number is defined as a natural number greater than 1 and is divisible by only 1 and itself.  */
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int i=2,flag=0,n,m;
        System.out.println("enter number value");
         n=ob.nextInt();//10
         m=n/2;//3
         /*
         if(n==0||n==1)
         {
            System.out.println("not prime");
         }
         else
         {
            for(i=2;i<=m;i++)
            {
              if(n%i==0)
              {
                flag=1;
                System.out.println("not prime");
                break;
              }
            }
         }
         if(flag==0)
         {
            System.out.println("prime number");
         }
  
          */

         
         /*
           if(n==0 || n==1)
          {
            System.out.println("Not Prime");
          }
          else
          {
             i=2;
            while(i<=m)
            {
              if(n%i==0)
              {
                 flag=1;
                 System.out.println("Not Prime");
                 break;
                 
              }
              i++;
            }
            if(flag==0)
            {
               System.out.println("Prime number");
            }
          }

          */

          if(n==0 || n==1)
          {
            System.out.println("Not Prime");
          }
          else if(n==2)
          {
            flag=0;
          }
          else
          {
             do
             {
              if(n%i==0)
              {
               flag=1;
               System.out.println("Not prime");
               break;
              }
              i++;
             }while(i<=m);  
           }
         

            
            if(flag==0 )
            {
               System.out.println("Prime number");
            }
          }




         }
    

