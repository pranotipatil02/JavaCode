package Basic;

public class LocalVariable {
   void add()
   {
    int a=45,b=23,c;//LOCAL variable
    c=a+b;
    System.out.println("Add: "+c);
   }
   void sub()
   {
    int a=45,b=23,c;//LOCAL
    c=a-b;
    System.out.println("Sub: "+c);
   }
    public static void main(String[] args) {
        LocalVariable localvar=new LocalVariable();
        
        localvar.add();
        localvar.sub();
        
        
    
    }
    
}
