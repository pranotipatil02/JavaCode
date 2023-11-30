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
public class Single {
    public static void main(String[] args) {
        Subtraction obj=new Subtraction();
        obj.add();
        obj.sub();
    }
    
}
