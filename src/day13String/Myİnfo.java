package day13String;

import java.util.Scanner;

public class Myİnfo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Write your age");
        int age=input.nextInt();

        System.out.println("enter your gender");
        String gender=input.next();

        input.nextLine();

        System.out.println("write your full name");
        String fullNmae=input.nextLine();

        System.out.println("write your phone number");
        long phoneNumber=input.nextLong();

        System.out.println("write your zıpcode");
        String zipCode=input.next();

        input.nextLine();

        System.out.println("write your school name");
        String schoolName=input.nextLine();

        System.out.println("write your city name");
        String cityNmae=input.nextLine();

        System.out.println("enter your state  name");
        String stateName=input.next();

        System.out.println("enter your building number");
        int buildingNumber=input.nextInt();

        input.nextLine();

        System.out.println("enter your Street name");
        String streetNmae=input.next();

        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("fullNmae = " + fullNmae);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("zipCode = " + zipCode);
        System.out.println("schoolName = " + schoolName);
        System.out.println("cityNmae = " + cityNmae);
        System.out.println("stateName = " + stateName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetNmae = " + streetNmae);




input.close();

    }


}
