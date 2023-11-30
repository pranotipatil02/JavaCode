public class CopyConstructor {
    int area;
    CopyConstructor(int height,int width)
    {
      area=height*width;
    }

    void display()
    {
        System.out.println("Rectangle area: "+area);
    }
    public static void main(String[] args) {
      CopyConstructor obj=new CopyConstructor(3, 4) ; 
      obj.display();
      CopyConstructor o2=obj;
      o2.display();

    }
    
}
