package Basic;

public class Expression {
    public static void main(String[] args) {
        int p=5,q=2;
        int r,s;
        r=++q;//3
        System.out.println("r=++q:- "+r);//3
        s=p++;//5: 5+1:6
        System.out.println("s=p++ :- "+s);//5
        System.out.println("p :- "+p);//6

        r++;
        System.out.println("r:- "+r);//3
        System.out.println("r++:"+r);//4


    }
    
}
