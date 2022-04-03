package day12Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write circle's radius");

        double radıus=scan.nextDouble();
        scan.close();
        double perimeter=2*3.14*radıus;
        double area=3.14*radıus*radıus;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);




    }


}
