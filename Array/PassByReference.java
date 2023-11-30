public class PassByReference {
    void refFun(int x[])
    {
    System.out.println("x[0]="+x[0]);//10
     x[0]=45;    
}
    public static void main(String[] args) {
        int a[]={10,20,30};
        System.out.println("a[0]="+a[0]);//10
        PassByReference obj=new PassByReference();
        obj.refFun(a);
        System.out.println("a[0]="+a[0]);//45

    }
    
}
