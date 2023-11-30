import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        /*
         initialize;
         do
         {
            state;
            incree/decree;
         }while(cond);
         */
        // 1 to 10
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int  num=sc.nextInt();

        int i=1;
        do{
            System.out.println(num+"*"+i+"="+(num*i));
            i++;
        }while(i<=10);
        sc.close();
    }
    
}
