import java.util.Scanner;

public class ContinueEx {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=ob.nextInt();//5
        
        for(int i=1;i<=n;i++)
        {
        if(i==3)
        {
            continue;
        }
        else
        {
            System.out.println(i);//
        }
        }
    }
}
