import java.util.Date;

public class Employees {
    /*Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat
 */

 String name,address;
    int year_of_joining,salary;
    
    void  display()
    {
     System.out.println(name+"     "+year_of_joining+"     "+address);
    }
 public static void main(String[] args) {
    Employees emp1=new Employees();
    Employees emp2=new Employees();
    Employees emp3=new Employees();
    System.out.println(" Name "+"   "+" Year of joining "+"   "+" Address ");

    emp1.name="Robert";
        emp1.year_of_joining=1994;
    emp1.address="64C- WallsStreat";
    emp1.display();

    emp2.name="Sam";
    emp2.year_of_joining=2000;
    emp2.address="68D- WallsStreat";
    emp2.display();

   emp3.name="John";
    emp3.year_of_joining=1999;
    emp3.address="26B- WallsStreat";
    emp3.display();

}
}
