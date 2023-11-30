package Basic;

public class StaticVariable {
    static int a=67,b=32;
    static void add()
    {
        int c=a+b;
        System.out.println("Add: "+c);
    }
    public static void main(String[] args) {
       System.out.println(StaticVariable.a+StaticVariable.b);
        StaticVariable.add();
    }
    
}
