import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        /*
         intialization; //1)
         while(cond)// 2)
         {
            state;// 3)
            incree/decree; //4)
         }
         */
        //reverse n-1
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int  num=sc.nextInt();
        int i=num;//5
        while(i>=1)
        {
            System.out.print(i+" ");
            i--;
        }
        sc.close();
    }
    
}
