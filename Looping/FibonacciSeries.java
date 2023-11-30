import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        /*addition of previous two digits form third digit */
     // 0 1 1 2 3 5 8 
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number value");
     int num=sc.nextInt();
    int a=0,b=1,c=0;
     for(int i=1;i<=num;i++)
     {
     System.out.print(c+" ");
     a=b;
     b=c;
     c=a+b;
     }      
     sc.close(); 
    }
    
}
