interface Student
{
   int rollno=10;
  String name="mohit";
  void StudentDisplay(); //declare
}
class StudentImplementation implements Student
{
    private int b=4;
public int a=10;
public void StudentDisplay() {
    System.out.println("Rollno: "+rollno+"\n Name: "+name);
    
}

}
public class InterfaceEx {
    public static void main(String[] args) {
        StudentImplementation obj=new StudentImplementation();
        obj.StudentDisplay();
      
    }
}
