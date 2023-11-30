class Rectangle
{
    int height=10,width=2;
    void FindArea()
    {
        int h=23,w=4,area;
        area=h*w;
        System.out.println("Area="+area);
        area=this.height*this.width;
        System.out.println("Area: "+area);
    }
}
class ThisKeyWithVar
{
    public static void main(String[] args) {
        Rectangle o=new Rectangle();
        o.FindArea();
    }
}