import java.util.Scanner;

class ForOneToN
{

    /*for(initialization;cond;incre/decre)
     {
        stat;
     }
     */
/*
 initialization;
 while(cond)
 {

    stat;
    incre/decree;
 }
 */

 /*
  initialization;
  do
  {
    stat;
    incre/decree;
  }while(cond);
  */



    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter n value");
        int n=ob.nextInt();
        for(int i=2;i<=n;i=i+2)//1-n
    {
        System.out.println(i);//2
    }

    System.out.println("one to n series using while");
    int j=1;
    while(j<=10)//
    {
        System.out.println(n*j);//5 10
        j++;//2 3
    }
    System.out.println("one to n series using do while");
 int c=1;
    do//
    {
        System.out.println(c);//1 2 3
        c++;//2 3
    }while(j<=n);


    }
}