class Operation
{
    int square(int n)
    {
        return n*n;
    }
}
public class Aggregation {
Operation op;//Aggregation

double pi=3.14;
double area(int r)
{
    op=new Operation();
    double ar=op.square(r);
    return pi*ar;

}
    public static void main(String[] args) {
        Aggregation ob=new Aggregation();
        
        System.out.println("Area: "+ob.area(5));
    }
    
}
