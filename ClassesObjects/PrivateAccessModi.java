class Student
{
    private String name;
    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }
}
public class PrivateAccessModi {
    public static void main(String[] args) {
        Student std=new Student();
        
        std.setName("Kunal");
        System.out.println("Student name: "+std.getName());
    }
}
