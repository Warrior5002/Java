package UdemyJava;

import java.util.Scanner;

public class areatriangle {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int a, b, c;
        double s,area;
        System.out.println("Enter sides of the triangle");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        s=(a+b+c)/2f;

        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area of the triangle is : " + area);


    }
}