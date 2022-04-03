package day18NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class AddittionOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        while (true) {

            System.out.println("write a number");
            int n1 = scan.nextInt();

            System.out.println("enter second number");
            int n2 = scan.nextInt();

            System.out.println("addidtion ıs: " + (n1 + n2));

            System.out.println("would you like to contınue");
            String a= scan.next().toLowerCase();

            while (!(a.equals("yes")||a.equals("no"))){
                System.out.println("invalid answer write your answer again");
                a= scan.next().toLowerCase();
            }

            if (a.equals("no")){
                break;
            }

        }
scan.close();
    }




}
