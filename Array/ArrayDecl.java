import java.util.Scanner;

public class ArrayDecl {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[3];
        arr[0]=10; 
        arr[1]=20;
        arr[2]=30;
        System.out.println("arr[0]: "+arr[0]);
        System.out.println("arr[1]: "+arr[1]);
        System.out.println("arr[2]: "+arr[2]);
        int[]  a={1,2,3,4,5,6,7};
        System.out.println("a[0]: "+a[0]);
        System.out.println("a[1]: "+a[1]);
        System.out.println("a[2]: "+a[2]);
         System.out.println("a[3]: "+a[3]);   
         
         for(int i=0;i<arr.length;i++)//10 20 30
         {
            System.out.println(arr[i]);//10 20 30
         }

       for(int j=0;j<a.length;j++)
       {
        System.out.println("value at "+(j)+": "+a[j]);
       }

    
       int x[]=new int[3];

       for(int i=0;i<x.length;i++)
       {
        System.out.println("enter element at "+i);
        x[i]=sc.nextInt();
       }

       for(int j=0;j<x.length;j++)
       {
        System.out.println(""+j+"="+x[j]);
       }
     



    }
    
}
