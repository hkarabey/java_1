package day19;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("write a number");
        int n1= scan.nextInt();

        System.out.println("write a operator");
        char operator=scan.next().charAt(0);

        System.out.println("write a second number");
        int n2= scan.nextInt();

        if(!(operator=='+'||operator=='-')){
            System.out.println("invalid operator "+operator);
       System.exit(0);
        }
scan.close();
    }




}
