import java.util.Scanner;

class OneToN
{
    public static void main(String[] args) {
        // one to n series
        //1-n
        Scanner ob=new Scanner(System.in);
        System.out.println("enter number value");
        int n=ob.nextInt();
        System.out.println("one to n series");
        for(int i=1;i<=n;i++)//5
        {
            System.out.print(i+" ");//1 2 3 4 5 
        }

        System.out.println("n to one series");//n-1
        for(int i=n;i>=1;i--)
        {
            System.out.println(i);//4 3 2 1
        }
 
        System.out.println("Even number series");

        for(int i=2;i<=n;i=i+2)
        {
            System.out.println(i);//2 4 6
        }

        System.out.println("Odd number series");

        for(int i=1;i<=n;i=i+2)
        {
            System.out.println(i);//1 3 5
        }
        
        System.out.println("tabel");
        for(int i=1;i<=10;i++)
        {
            System.out.println(n*i);//5 10 15 20
        }

        

}

}