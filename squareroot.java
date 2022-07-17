package UdemyJava;

import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {
        int a,b;
        System.out.println("SQUARE ROOT OF : " );
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b= (int) Math.sqrt(a);

        System.out.println("is " + b);
    }
}
