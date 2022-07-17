package UdemyJava;

import java.util.Scanner;

public class area {

    public static void main(String[] args) {
      float b,h,area ;

        Scanner z=new Scanner(System.in);
       
        System.out.println("Enter base of triangle : ");
        b= z.nextFloat();
        System.out.println("Enter height of the triangle : ");
        h= z.nextFloat();
        area=(h*b)/2;
        System.out.println("Area of the triangle is : " + area);



    }
}
