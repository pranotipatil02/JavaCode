import java.util.Arrays;
import java.util.Comparator;
//sort element according rollno
class Student
{
 int rollno;
 String name,address;
public Student(int rollno, String name, String address) {
    this.rollno = rollno;
    this.name = name;
    this.address = address;
}
@Override
public String toString() {
    return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
}
 
}
class SortAccordingRollno implements Comparator<Student>
{
//ascending order sort
    @Override
    public int compare(Student o1, Student o2) 
    {
        
        
        // TODO Auto-generated method stub
        return o1.rollno-o2.rollno;
    }
    
}
class ArrayOfObj
{
    public static void main(String[] args) {
       Student obj[]={new Student(5, "Kunal", "Pune"),new Student(2, "Rahul", "mumbai"),new Student(1, "Neha", "jaipur")};
    
       System.out.println("unsorted: ");
       for(int i=0;i<obj.length;i++)
       {
        System.out.println(obj[i]);
       }
   Arrays.sort(obj,new SortAccordingRollno());
   System.out.println("Sorted:");
    for(int i=0;i<obj.length;i++)
       {
        System.out.println(obj[i]);
       }
    }
}