import java.util.Scanner;

public class IfElseIfLadder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks=sc.nextInt();
        /*
         if(cond)
         {
            state;
         }
         else if(cond)
         {
            state;
         }
         else if(Cond)
         {
            state;
         }
         else
         {
            state;
         }
         */
        
         if(marks<=100 && marks>=80)
         {
            System.out.println("A grade");
         }
         else if(marks<=79 && marks>=60)
         {
            System.out.println("B grade");
         }
         else if(marks<=59 && marks>=40)
         {
            System.out.println("C grade");
         }
         else
         {
            System.out.println("fail");
         }
    }
    
}
