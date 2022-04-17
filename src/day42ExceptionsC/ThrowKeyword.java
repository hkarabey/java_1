package day42ExceptionsC;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        System.out.println("enter your age");
        int age=new Scanner(System.in).nextInt();
        if (age<0) {
          /*  System.out.println("invalid age" + age);
            System.exit(1);

           */
            throw new InputMismatchException("age can not be negative "+age);
        }

        if (age>21)
            System.out.println("you are eligible");
        else
            throw new RuntimeException("you be at least 21 years old");

    }



}
