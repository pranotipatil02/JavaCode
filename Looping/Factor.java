import java.util.Scanner;
/*completely divisble by given number is known as factor */
public class Factor {
    public static void main(String[] args) {
         Scanner ob=new Scanner(System.in);
       int number ;
       System.out.println("enter number: ");
       number=ob.nextInt();
       for(int i=1;i<=number;i++)
       {
        if(number%i==0)
        {
            System.out.println(i);//1 2 5
        }
        ob.close();
       }
    }
    
}
