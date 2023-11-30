
class Addition
{
    public void add()
    {
        int a=10,b=20,c;
        c=a+b;
        System.out.println("Add: "+c);
    }
}

interface Subtraction
{
    public void sub();
}

class Multiplication extends Addition implements Subtraction
{
    void Multi()
    {
        int a=10,b=20,c;
        c=a*b;
        System.out.println("Multi: "+c);
    }

    public void sub()
    {
        int a=50,b=20,c;
        c=a-b;
        System.out.println("Sub: "+c);
    }
}
public class Multiple {
    public static void main(String[] args) {
     Multiplication obj=new Multiplication();
     obj.add();
     obj.sub();
     obj.Multi();        
    }
    
}
