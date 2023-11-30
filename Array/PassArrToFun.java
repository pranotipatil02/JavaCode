public class PassArrToFun {
    public void arraySum(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];//10=10+20=30+30=60+40=100+50
        }
        System.out.println("sum: "+sum);

    }
    public static void main(String[] args) {
        PassArrToFun obj=new PassArrToFun();
        int a[]={10,20,30,40,50};
        obj.arraySum(a);
    }
}
