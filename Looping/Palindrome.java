import java.util.Scanner;

public class Palindrome {
    /*a number that is equal to the reverse of that same number is called a palindrome number. For example, 3553, 12321, etc. */
    public static void main(String[] args) {
         Scanner ob=new Scanner(System.in);
        int n,temp,mod,rev=0;
        System.out.println("enter number value");
        n=ob.nextInt();
        temp=n;
        while(n!=0)
        {
            mod=n%10;//1
            rev=(rev*10)+mod;//0+1=1=10+2=12=12*10=120+1=121
            n=n/10;//12
        }
        if(rev==temp)
        {
            System.out.println("number is palindrome");
        }
        else
        {
            System.out.println("number is not palindrome");
        }
    }
    
}
