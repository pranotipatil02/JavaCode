class TypeCasting
{
    public static void main(String[] args) {
        int primitiveInt=78;
        Integer wrapperInt=primitiveInt;//autoboxing
        System.out.println("primitiveInt: "+primitiveInt);
        System.out.println("WrapperInt: "+wrapperInt);

        int num=10;
        Integer numInt=new Integer(num);
        System.out.println("numInt: "+numInt);

    }
}