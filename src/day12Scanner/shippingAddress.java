package day12Scanner;

import java.util.Scanner;

public class shippingAddress {
    /*
    full name-nextLine
    building name-next--->after this we must declare extra nextline method
    street name-nextline
    city name-nextLine
    state-next
    zipcode-next

     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullNmae=input.nextLine();

        System.out.println("enter yor building number");
        String buildingNmae=input.next();

        input.nextLine();

        System.out.println("enter your Street name");
        String streetName=input.nextLine();

        System.out.println("enter your city name");
        String cityNmae=input.nextLine();

        System.out.println("enter your state ");
        String state=input.next();

        System.out.println("enter your zipcode");
        String zipcode=input.next();

        System.out.println("fullNmae = " + fullNmae);
        System.out.println("buildingNmae = " + buildingNmae);
        System.out.println("streetName = " + streetName);
        System.out.println("cityNmae = " + cityNmae);
        System.out.println("state = " + state);
        System.out.println("zipcode = " + zipcode);


input.close();
    }


}
