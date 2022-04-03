package day12Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        /*ask use to age
        aks user full name
         */
        Scanner input=new Scanner(System.in);

        System.out.println("enter your age");
        int age=input.nextInt();

        System.out.println("write your gpa");
        double gpa= input.nextDouble();

        input.nextLine();// important if we do not write method left the scanner class
                        //if we use next line method
        System.out.println("enter your full name");
        String fullName=input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);



        input.close();
    }



}
