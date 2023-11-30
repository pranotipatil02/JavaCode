public class FinalizeEx {
    public static void main(String[] args) {
        MyObject obj1=new MyObject(1);
        MyObject obj2=new MyObject(2);
        
        obj1=null;
        obj2=null;
        System.gc();
    }
    
}
