package day18NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("enter your age");
            int age = scan.nextInt();

            while (!(age >= 1 && age <= 120)) {
                System.out.println("invalid entry please write valid age");
            }
            System.out.println("would you like to contınue");
            String a = scan.next().toLowerCase();
            while (!(a.equals("yes")||a.equals("no"))){
                System.out.println("invalid entry, would you like to contınue ");
            a= scan.next().toLowerCase();
            }

            if (a.equals("no")) {
                break;
            }

        }
scan.close();
    }


}
