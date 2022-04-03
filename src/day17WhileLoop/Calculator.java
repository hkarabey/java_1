package day17WhileLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("write a number");
        int n1 = scan.nextInt();

        System.out.println("Write a second number");
        int n2 = scan.nextInt();

        System.out.println("enter a math operator");
        char ch=scan.next().charAt(0);

        while (!(ch=='+'||ch=='-')){
            System.out.println("invalid operator, please re-enter");
            ch=scan.next().charAt(0);
        }
        System.out.println( (ch=='+')? n1+n2:n1-n2 );


        scan.close();
    }


}
