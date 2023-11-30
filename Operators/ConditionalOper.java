import java.util.Scanner;

class ConditionalOper
{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String ev="Even";
        String od="Odd";
        String result;
        System.out.println("Enter number");
        int n=ob.nextInt();
        result=(n%2==0)?ev:od;
       System.out.println("Result: "+result);
        //cond?exp1:expr2;
    }
}