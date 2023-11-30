import java.util.Scanner;

class Manipulation
{
    public static String display(String s)//mohit
        {                                 //01234
            StringBuffer sb=new  StringBuffer();        
               char a=s.charAt(0);//m
               char b=s.charAt(1);//o
             if(a!='j' && b !='b')
             {
                sb.append(s.substring(2));
             }//jeet
             // 0123
             else if(a=='j' && b!='b')//
             {
                sb.append('j').append(s.substring(2));
             }
             else
             {
                sb.append(s.substring(0));
             }
            return sb.toString();
          }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string: ");
        String str=sc.nextLine();
        System.out.println(display(str));
        
    }
}


