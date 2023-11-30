package package1;

 class ProtectedTest {
    public int a=20,b=30,c;
    protected void add()
    {
      c=a+b;
      System.out.println("Add: "+c);
    }
    
}
public class ProtetedAccessModi extends ProtectedTest  {
    public static void main(String[] args) {
    ProtectedTest obj=new ProtectedTest();
    obj.add();
    }
    
}

