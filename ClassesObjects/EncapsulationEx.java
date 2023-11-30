
 class Encapsulation {
    private int addhar_card;
    private String name;
    private int Age;

    public void setAddharCard(int addharNum)
    {
        addhar_card=addharNum;
    }
    public int getAdhharCard()
    {
        return addhar_card;
    }

    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        Age=age;
    }
    public int getAge()
    {
        return Age;
    }
    
}

public class EncapsulationEx
{
public static void main(String[] args) {
     Encapsulation obj=new Encapsulation();
     
     obj.setAddharCard(56413267);
     obj.setName("Saniya");
     obj.setAge(34);
     
     System.out.println("Addhhar Card Number: "+obj.getAdhharCard());
     System.out.println("Name: "+obj.getName());
     System.out.println("Age: "+obj.getAge());
    }
    
}
