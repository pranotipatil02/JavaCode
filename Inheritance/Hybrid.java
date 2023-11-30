package Inheritance;
interface Addition
{
//declaring method
//because we can not define function inside interface
void add(); 
}
//Derived class 
class Subtraction
{
public void sub()
 {
 int x,y=30,z=10;
 x=y-z;
 System.out.println("Sub="+x);
 } 
}
//Derived class extending base class
//and implementing interface
class Multiplication extends Subtraction implements Addition
{
 //implementing method of interface
 public void add()
 {
 int x,y=30,z=10;
 x=y+z;
 System.out.println("Add="+x);
 }
void multi()
 {
 int x,y=30,z=10;
 x=y*z;
 System.out.println("Multiply="+x);
 } 
}
class Division extends Multiplication
{
void div()
 {
 int x,y=30,z=10;
 x=y/z;
 System.out.println("Div="+x);
 } 
}
public class Hybrid
{
public static void main(String[] args)
{
 //Creating instance(object)
 Division obj=new Division();
 obj.add();
 obj.multi();
 obj.div();
}
}
