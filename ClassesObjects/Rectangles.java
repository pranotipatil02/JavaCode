public class Rectangles {
    int area;

    Rectangles(int height,int width)// parameterized constructor
    {
        area=height*width;
        System.out.println("Rectangle area: "+area);
    }

    
    public static void main(String[] args) {
     Rectangles obj=new Rectangles(10,20);

        
    }
    
}
