package ArrayList;
import java.util.ArrayList;
public class CopyArrayList {
    public static void main(String[] args) {
ArrayList <Integer> num1=new ArrayList<>();
num1.add(10);
num1.add(20);
num1.add(30);
System.out.println("array list:"+num1);
ArrayList num2=num1;// using assignment operator
System.out.println("copy using reference object: "+num2);
num1.set(0, 40);//reflect in both list because it is reference obj
System.out.println("num1:"+num1);
System.out.println("num2:"+num2);
ArrayList <Integer> num3=new ArrayList<Integer>();
//add using loop
for(int i:num1)
{
    num3.add(i);
}
System.out.println("num3:"+num3);
}
//pass obj in a constructor


    
}
