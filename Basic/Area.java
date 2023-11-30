package Basic;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //c=3.14*r*r
        //t=0.5*b*h
        //r=l*w
        double pi=3.14;
        System.out.println("enter radius: ");
        double r=sc.nextDouble();
        double circle=pi*r*r;
        System.out.println("circle: "+circle);

        System.out.println("enter base and height: ");
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        double triangle=0.5*base*height;
        System.out.println("Triangle: "+triangle);

    }
    
}
