import java.util.Scanner;

public class IncreDecre {
    public static void main(String[] args) {
        //++a  a++   by default 1
        //--a   a--
         Scanner ob=new Scanner(System.in);
                System.out.println("enter a number");
                int a=ob.nextInt();//10
                System.out.println("a:"+a);//10
                System.out.println("++a: "+(++a));// 1+10=11
                System.out.println("a:"+a);//11

                System.out.println("a++: "+(a++));//11 -> 11+1=12
                System.out.println("a:"+a);//12

                System.out.println("--a: "+(--a));//12-1=11
                System.out.println("a:"+a);//11

                System.out.println("a--: "+(a--));//11 ->11-1=10
                System.out.println("a:"+a);//10

                /*
                 a=10
                 ++a:-11
                 a++:-11 :-12
                 --a:-11
                 a--:- 11 :-10
                 a=10
                 */
    }
    
}


