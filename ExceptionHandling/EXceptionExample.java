public class EXceptionExample {
public static void main(String[] args) {
    int a[]={2,3,4};
    // System.out.println("a[0]:"+a[0]);//2
    // System.out.println(a[5]);

    try
    {
        System.out.println("a[3]:"+a[3]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println(e.getLocalizedMessage());
    }

}
}
