package UdemyJava;

import java.util.Scanner;

public class Quadraticequation {
    public static void main(String[] args) {
        int a,b,c;
        double r1,r2;
        Scanner sc =new Scanner(System.in);


        System.out.println("Enter a = ");
        a= sc.nextInt();
        System.out.println("Enter b = ");
        b= sc.nextInt();
        System.out.println("Enter c = ");
        c= sc.nextInt();
        r1= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        r2= (-b-Math.sqrt(b*b-4*a*c))/(2*a);

        System.out.println("Roots are " +r1+" and "+r2);



    }
}
