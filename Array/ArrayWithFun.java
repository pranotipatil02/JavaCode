public class ArrayWithFun {

    public void intArray()
    {
      int[] num=new  int[3];
      num[0]=10;
      num[1]=20;
      num[2]=30;
    //   System.out.println("num[0]:"+num[0]);
    //   System.out.println("num[1]:"+num[1]);
    //   System.out.println("num[2]:"+num[2]);
      for(int i=0;i<num.length;i++)
      {
       System.out.println("num["+i+"]="+num[i]);
      }
    }
    public static void main(String[] args) {
        ArrayWithFun obj=new ArrayWithFun();
        obj.intArray();
    }
    
}
