package UdemyJava;

import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {

        int length,breadth,height;
        int totalArea,Volume;

        Scanner Sc= new Scanner(System.in);

        System.out.println("Enter Length :");
        length = Sc.nextInt();
        System.out.println("Enter Breadth");
        breadth = Sc.nextInt();
        System.out.println("Enter Height");
        height = Sc.nextInt();

        Volume=(length*breadth*height);
        totalArea=2*(length*breadth+length*height+breadth*height);

        System.out.println("Volume of the cuboid is " + Volume);
        System.out.println("Total Area of the cuboid is " + totalArea);


    }
}
