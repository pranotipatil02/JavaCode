class Parameter
{
    int h=23,w=5;
}
class RectangleExample extends Parameter
{
int height=12,width=45;
void area()
{
    int ar=height*width;
    System.out.println("Area: "+ar);
    ar=super.h*super.w;
    System.out.println("Area: "+ar);
}
}
public class SuperWithVar {
    public static void main(String[] args) {
        RectangleExample o=new RectangleExample();
        o.area();
    }
}
