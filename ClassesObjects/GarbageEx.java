public class GarbageEx {
    public void finalize()
    {
     System.out.println("finalize called");
    }
    public static void main(String[] args) {
        String obj=new String("RRR");
        System.out.println("Str: "+obj);//RRR
       
        obj=null;
        System.out.println("Main started");
        System.gc();
        
    }
    
}
