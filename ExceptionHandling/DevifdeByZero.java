public class DevifdeByZero {
    public static void main(String[] args) {
       //System.out.println("devide by zero: "+(45/0));
     
       try {
        System.out.println("devide by zero :"+(56/0));
       } catch (Exception e) {
        // TODO: handle exception
       System.out.println(e.getLocalizedMessage());  
    }

    }
    
}
