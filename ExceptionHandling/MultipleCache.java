public class MultipleCache {
    public static void main(String[] args) {
        int a[]={2,3,4};
        //int x=34/0;
       //System.out.println("array index a[4]:"+a[4]);
       //System.out.println("devide by zero: "+x);
   
     try {
       System.out.println("Array index out of bound a[4]: "+a[4]);
        //System.out.println("devide by zero: "+(56/0));
     } catch (ArrayIndexOutOfBoundsException e) {
        // TODO: handle exception
        System.out.println("index out of bound :"+e.getLocalizedMessage());
     }
     catch(ArithmeticException e)
     {
      System.out.println("devide by zero: "+e.getLocalizedMessage());
     }
    }
    
}
