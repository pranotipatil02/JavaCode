public class AutoBoxingUnboxingEx {
    public static void main(String[] args) {
        int primitiveInt=100;
        Integer wrapperInt=primitiveInt;//autoboxing
 System.out.println("wrapperInt: "+wrapperInt);
        //double wrapper classes converion into there primitive type
        Double wrapperDouble=3.14;
        double primitiveDouble=wrapperDouble;//unboxing
  System.out.println("primitiveDouble: "+primitiveDouble);

   Integer num1=23;
   Integer num2=56;
   Integer sum=num1+num2;
   System.out.println("Integer wrapper classes sum: "+sum);

    }
    
}
