public class StaticVariable {
    static int count=0;
   public StaticVariable()
    {
        count++;
    }
    public static void main(String[] args) {
        StaticVariable obj1=new StaticVariable();
        System.out.println("count: "+obj1.count);
        StaticVariable obj2=new StaticVariable();
        System.out.println("count: "+obj2.count);
    }
}
