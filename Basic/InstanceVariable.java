package Basic;

public class InstanceVariable {
    int x=56,y=34,z;//instance variable
    static int p=10,q=20;

      void add()
    {       
        int a=45,b=3,c;//local var
        c=a+b;
        System.out.println("Add: "+c);
      
    }
    public static void main(String[] args) {
        InstanceVariable instanceVar=new InstanceVariable();
        instanceVar.add();       

        
        
    
        }
    
}
