
public class GarbageCollectorEx {
    public void finalize()
    {
        System.out.println("object is garbage collected");
    }
    void A()
    {
        System.out.println("hiiii");
    }
    public static void main(String[] args) {
        GarbageCollectorEx obj1=new GarbageCollectorEx();
        GarbageCollectorEx obj2=new GarbageCollectorEx();
        obj1=null;
        obj2.A();
    
        System.gc();
    }
    
}
