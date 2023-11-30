import java.util.Scanner;

public class VowelsCon {
public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter char");
    char ch=obj.next().charAt(0);//abc
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='u' )
    {
        System.out.println("Vowels");
    }
    else
    {
        System.out.println("Consonents");
    }
}    
}
