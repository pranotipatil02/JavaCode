public class ThisKeyUseRectangle extends Parameter {
    int height=2,width=3;
    void area()
    {
        int ar=super.height*super.width;
        System.out.println("Area: "+ar);
        ar=this.height*this.width;
        System.out.println("Area: "+ar);
    }

    public static void main(String[] args) {
        ThisKeyUseRectangle obj=new ThisKeyUseRectangle();
        obj.area();
    }
}

