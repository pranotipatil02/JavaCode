/*how to calculate the net salary of an employee by considering the parameters called HRA(House rent allowance),DA(Dearness allowance),GS (Gross salary)and income tax. Let us assume some parameters.
HRA=10% of basic salary
DA=73% of basic salary
GS=basic salary+DA+HRA
Income tax=30% of gross salary
net salary= GS-income taxAlgorithm:
1)Start
2)Take the input from the user as employee name,id and basic salary
3)Calculate the the above parameters DA,HRA,GS,income tax and net salary
4)Display the output
5)Stop
 */
package Basic;
import java.util.*;
class Employee
{
    float HRA,DA,GS,IncomeTax,netSalary,grossSalary;
int basicSalary;
public void readInput()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Employee Name: ");
    String name=sc.next();
    System.out.println("Enter Employee Id: ");
    String id=sc.next();
    System.out.println("Enter Employee Basic salary"); 
     basicSalary=sc.nextInt();
    Calculate();
  
}
public void Calculate()
{
    
    HRA=(10*basicSalary)/100;
    DA=(73*basicSalary)/100;
    grossSalary=HRA+DA+basicSalary;
    IncomeTax=(30*basicSalary)/100;
    netSalary=grossSalary-IncomeTax;  
}
public void Display()
{
    System.out.println("HRA: "+HRA);
    System.out.println("DA: "+DA);
    System.out.println("grossSalary: "+grossSalary);
    System.out.println("IncomeTax : "+IncomeTax);
    System.out.println("netSalary: "+netSalary);

}

}
public class empHraPaDa {

    public static void main(String[] args) {
        Employee ob=new Employee();
        ob.readInput();
        ob.Display();

}    
}
