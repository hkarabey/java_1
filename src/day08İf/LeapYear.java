package day08İf;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write a year");
        int year=scan.nextInt();
        scan.close();

        boolean leapYear=year%4==0;
        System.out.println(year+" is leap year:"+leapYear );

    }


}
