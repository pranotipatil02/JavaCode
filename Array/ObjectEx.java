public class ObjectEx {
public static void main(String[] args) {
    Object[] obj=new Object[5];
    obj[0]="happy";
    obj[1]=11;
    obj[2]='A';
    for(Object o:obj)
    {
        System.out.println(o);
    }
}    
}
