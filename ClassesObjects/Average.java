import java.util.Scanner;

public class Average {
    /*Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average. */
    int a,b,c,avg;
    void input()
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter three numbers");
     a=sc.nextInt();
     b=sc.nextInt();
          c=sc.nextInt();

    }
    void calculate()
    {
    avg=(a+b+c)/3;
    System.out.println("Average: "+avg);
    }

    public static void main(String[] args) {
      Average averageObj=new Average();
      averageObj.input();
      averageObj.calculate();  
    }
    
}
