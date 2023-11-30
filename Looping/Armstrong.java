import java.util.Scanner;

public class Armstrong {
/*An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits. */
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
       int number , originalNumber, remainder,sum=0;
       System.out.println("enter number: ");//153,370: (1*1*1)+(5*5*5)+(3*3*3)
       number=ob.nextInt();
       System.out.println("enter power value");
       int power=ob.nextInt();
        originalNumber = number;

        while (originalNumber != 0)
        {
            
            remainder = originalNumber % 10;//3//5
            //result += Math.pow(remainder, 3);
           // sum=sum+(remainder*remainder*remainder);//0+27=27+125=152+1=153
           sum+=Math.pow(remainder, power);//0+27=27+125=152+1=153 
           originalNumber = originalNumber/10;//15
        }

        if(sum == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
