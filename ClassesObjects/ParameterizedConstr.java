import java.util.Scanner;

public class ParameterizedConstr {
    int length,breadth,area;
        ParameterizedConstr(int l,int b)
        {
          length=l;
          breadth=b;          
        }
       
      
      
        void display()
        {
            area=length*breadth;
        System.out.println("Rectangle area: "+area);

        }
        
       
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter length and breadth value");
          int a=sc.nextInt();
          int b=sc.nextInt();
        ParameterizedConstr obj=new ParameterizedConstr(a, b);
       obj.display();
    }
    
}
