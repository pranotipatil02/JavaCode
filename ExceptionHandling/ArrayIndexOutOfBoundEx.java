public class ArrayIndexOutOfBoundEx {
    public static void main(String[] args) {
        int a[]={10,200,30};

        //System.out.println(a[3]);
         
        try {
            System.out.println("Try to print index value"+a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
        System.out.println("catch the error: "+e.getLocalizedMessage());//show type of error message 
        }

    //use when you dont want that your system crash  or program stop running there current one


    }
    
}
