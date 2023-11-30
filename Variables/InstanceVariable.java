public class InstanceVariable {
    String name;

    void printName()
    {
        System.out.println("Name: "+name);
    }
    public static void main(String[] args) {
        InstanceVariable o=new InstanceVariable();
        o.name="Instance variable";
        o.printName();        
    }
    
}
