import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        /*
         if(cond1)
         {
            state1;
            if(cond2)
            {
              state2;
            }
         }
         */

         Scanner sc=new Scanner(System.in);
         System.out.println("Enter three  value: ");
         int num1=sc.nextInt();
         int num2=sc.nextInt();
         int num3=sc.nextInt();
         if (num1>num2)
          {
            if(num1>num3)
            {
                System.out.println(num1+ " is gretest than "+num2+" and "+num3);
            }
            
         }

         if (num2>num1)
          {
            if(num2>num3)
            {
                System.out.println(num2+ " is gretest than "+num1+" and "+num3);
            }
            
         }

         if (num3>num1)
          {
            if(num3>num2)
            {
                System.out.println(num3+ " is gretest than "+num1+" and "+num2);
            }
            
         }
        }
}
