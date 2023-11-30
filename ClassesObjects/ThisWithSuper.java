class square
{
    int squ;
    square(int s)
    {
        squ=s*s;
        System.out.println("Square: "+squ);
    }


}
class RectangleEx extends square 
{
    int h=5,w=7,ar;
    RectangleEx()
    {
        super(5);
        ar=h*w;
        System.out.println("area: "+ar);
    }

}
public class ThisWithSuper {
  public static void main(String[] args) {
    RectangleEx obj=new RectangleEx();

  }  
}
