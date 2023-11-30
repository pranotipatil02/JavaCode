class RectEx
{
    RectEx(int height,int width)
    {
     int area=height*width;
     System.out.println("Rectangle area=: "+area);
    }

    RectEx()
    {
        this(2, 4);
        System.out.println("I am inside deafult constructor");
    }
}
public class ThisKeyWithConstru {
    public static void main(String[] args) {
        RectEx obj=new RectEx();
    }
    
}
