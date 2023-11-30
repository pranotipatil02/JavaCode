import java.util.Scanner;

public class TwoDarr {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        Scanner sc=new Scanner(System.in);
        // System.out.println("a[0][0]: "+a[0][0]);
        // System.out.println("a[0][1]: "+a[0][1]);
        // System.out.println("a[0][2]: "+a[0][2]);
        // System.out.println("a[1][0]: "+a[1][0]);
        // System.out.println("a[1][1]: "+a[1][1]);
        // System.out.println("a[1][2]: "+a[1][2]);
        // System.out.println("a[2][0]: "+a[2][0]);
        // System.out.println("a[2][1]: "+a[2][1]);
        // System.out.println("a[2][2]: "+a[2][2]);

        // for(int i=0;i<a.length;i++)//3
        // {
        //     for(int j=0;j<a.length;j++)//0 1
        //     {
        //         System.out.print(a[i][j]+ " ");
        //     }
        //     System.out.println();
        // }

         int arr[][]=new int[3][3];
         
         for(int i=0;i<arr.length;i++)
         {
            for(int j=0;j<arr.length;j++)
            {
                System.out.println("enter element at a["+i+"]["+j+"]");
                arr[i][j]=sc.nextInt();
            }
         }

         

         for(int i=0;i<arr.length;i++)//3
        {
            for(int j=0;j<arr.length;j++)//0 1
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
    
}
