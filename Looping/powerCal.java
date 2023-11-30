import java.util.Scanner;

public class powerCal {
public static void main(String[] args) {
    Scanner ob=new Scanner(System.in);
        int power,base,f=1,i;
        System.out.println("enter base and power value");
         base=ob.nextInt();
         power=ob.nextInt();
         for(i=1;i<=power;i++)
         {
            f=f*base;
         }
         System.out.println("power cal: "+f);

        // i=1;
        // while(i<=power)
        // {
        //     f=f*base;
        //     i++;
        // }
        // System.out.println(f);
        
         ob.close();
}    
}
