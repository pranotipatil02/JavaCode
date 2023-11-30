class Addition
{
    int a=10,b=20,c;
    void add()
    {
        c=a+b;
        System.out.println("Add: "+c);
    }
}
interface Hey
{
    
   public void h();
}

interface Subtraction
{
   
   public void sub();
    
}
class Multiex extends Addition  implements Hey, Subtraction
{
     int a=45,b=23,c=0;
   public void sub()
   {
        c=a-b;
        System.out.println("Sub: "+c);
   }
   public void h()
   {
    System.out.println("Hey");
   }
   void multi()
   {
    c=a*b;
    System.out.println("multi: "+c);
   }
} 
public class MultipleExample {
    public static void main(String[] args) {
        Multiex m=new Multiex();
        m.add();
        m.sub();
        m.h();
        m.multi();
    }
}
