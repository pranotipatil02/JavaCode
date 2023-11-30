import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        /*
                1)           2)      4)
         for(intialization;cond;incre/decree)
         {
            3)
            state;
         }
         */

         //1 to n

         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number value");
         int num=sc.nextInt();
         for(int i=1;i<=num;i++)//5
         {
            System.out.print(i+" ");//11
         }
         sc.close();
    }
    
}
