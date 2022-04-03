package day08İf;

public class SingleİfStatementİntro {

    public static void main(String[] args) {

        int number = -0;

        boolean evenNumber = number % 2 == 0;

        if (evenNumber) {

            System.out.println(number + " is even number");
        }
        if (!evenNumber) {
            System.out.println(number + " is odd number");

        }
        System.out.println("-------------------");

        int n = 17;
        if (n > 0) {
            System.out.println(n + " is positive");

        }
        if (n < 0) {
            System.out.println(n + " is negatif");

        }
        if (n == 0) {
            System.out.println(n + " is zero");

        }

    }


}
