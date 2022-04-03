package day12Scanner;

import java.util.Scanner;

public class Scannerİntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter an integer");
        int number1 = input.nextInt();
        System.out.println(number1);

        System.out.println("enter a decimal");
        double number2=input.nextDouble();
        System.out.println(number2);

        System.out.println("multipication="+(number1*number2));
        input.close();

    }

}
