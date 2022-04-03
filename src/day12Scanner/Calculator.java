package day12Scanner;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 12;
        double n2 = 14;
        char operator = '6';

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            switch (operator) {
                case '+':
                    System.out.println(n1 + n2);
                    break;
                case '*':
                    System.out.println(n1 * n2);
                    break;
                case '-':
                    System.out.println(n1 - n2);
                    break;
                case '/':
                    System.out.println(n1 / n2);
                    break;
            }

        } else {
            System.err.println("invalid operator");
        }


    }


}
