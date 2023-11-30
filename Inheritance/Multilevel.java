package Inheritance;
class Addition
{
    public void add()
    {
        int a=20,b=29,c;
        c=a+b;
        System.out.println("Add:"+c);
    }
}
class Subtraction extends Addition

{
    public void sub()
    {
        int a=50,b=23,c;
        c=a-b;
        System.out.println("Sub:"+c);
    }
    
}
class Mulitiplication extends Subtraction 
{   
    public void multi()
    {
        int a=2,b=5,c;
        c=a*b;
        System.out.println("Multi: "+c);
    }

}
public class Multilevel {
    public static void main(String[] args) {
           Mulitiplication obj=new Mulitiplication();
           obj.add();
           obj.sub();
           obj.multi();   
    }
}
