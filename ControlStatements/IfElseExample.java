import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
         if(cond)//true
         {
            state;
         }
         else
         {
            state;
         }
         */
        //voting criteria
        System.out.println("Enter your age");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible for the vote: ");
        }
        else
        {
            System.out.println("You are not eligible for the vote");
        }
    }
    
}
