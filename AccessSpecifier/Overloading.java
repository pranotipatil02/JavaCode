class Addition
{
   static int add(int a,int b)
    {
        return (a+b);
    }
    static int add(int a,int b,int c)
    {
        return (a+b+c);
    }
}
public class Overloading {
    public static void main(String[] args) {
       //Addition obj=new Addition();
    //    System.out.println("Add: "+obj.add(10,20 , 30));
    //    System.out.println("Add: "+obj.add(34, 450)); 
System.out.println(Addition.add(10, 20));
System.out.println(Addition.add(10,20 , 30));
}
    
}
