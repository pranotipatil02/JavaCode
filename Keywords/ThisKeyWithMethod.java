class Rec
{
    int height=10,width=2,area,square,num=2;
    void RectangleArea()
    {
        area=height*width;
        System.out.println("Rectangle area: "+area);
    }
    void square()
    {
        this.RectangleArea();
        square=num*num;
        System.out.println("Square: "+area);
    }

}

public class ThisKeyWithMethod {
    public static void main(String[] args) {
        Rec obj=new Rec();
        obj.square();
    }
}
