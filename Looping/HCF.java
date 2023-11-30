import java.util.*;

public class HCF {
    /* GCD(Gretest common factor) LCM(largest common measure)
     HCF(Highest common fator)
     Largest integer that can exactly divide both no. without any remainder
     always used smallest digit
     a=4   b=6
     1      1:- common
     2      2:- common (HCF)
     4      3
            6
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        

        /*
        System.out.println("Enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int Highest;
         for(Highest=a<b?a:b;Highest>=1;Highest--)
        {
            if(a%Highest==0 && b%Highest==0)
            {
                break;
            }

           }
                   System.out.println("HCF:"+Highest);

         */

  System.out.println("enter lowest and highest value"); 
  int lowest,highest;
  lowest=sc.nextInt();
  highest=sc.nextInt();
  int gcd=1;
  for(int i=1;i<=lowest;i++)
  {
    if(lowest%i==0 && highest%i==0)
    {
     gcd=i;
    }
  }     
    System.out.println("GCD: "+gcd);
}
}
