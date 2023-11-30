class A{
public int x=10;
public void StringName(String name)
{
System.out.println("Name: "+name);
}
}
public class PublicAccessModi {
   public static void main(String[] args) {
A obj=new A();
System.out.println("x: "+obj.x);
obj.StringName("Mohit");   
obj.x=20;
System.out.println("X: "+obj.x);

   } 
}
