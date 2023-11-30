import java.util.Scanner;

public class LCM {
    /*
    the Least Common Multiple (LCM) of two or more numbers is the 
    least positive number that can be divided by both the numbers, without leaving the remainder.
     It is also known as Lowest Common Multiple (LCM), Least Common Denominator, and Smallest Common Multiple. It is denoted by LCM (a, b) or lcm (a, b) where a and b are two integers.
     LCM=(A*B)/GCD;
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        System.out.println("enter lowest and highest value"); 
  int lowest,highest;
  lowest=sc.nextInt();
  highest=sc.nextInt();
int GCD=0,LCM;
  for(int i=1;i<=lowest && i<=highest;i++)
  {
    if(lowest%i==0 && highest%i==0)
    {
        GCD=i;
        
    }
  }
  System.out.println("GCD: "+GCD);
  LCM=(lowest*highest)/GCD;
  System.out.println("LCM: "+LCM);
    }
}
