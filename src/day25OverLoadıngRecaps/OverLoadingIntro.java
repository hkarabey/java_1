package day25OverLoadıngRecaps;

import java.util.Arrays;

public class OverLoadingIntro {
    public static void main(String[] args) {

        int[] intArray = {5, 6, 0, -1, 3, 4};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        Arrays.sort(doubleArray);

        char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(charArray);

        System.out.println("--------------");

        int sum1=sumOfNumbers(10,20);
        int sum2 = sumOfNumbers(10, 20, 30);
        int sum3 = sumOfNumber(10, 20, 30, 40);
        double sum4 = sumOfNumbers(10.0, 20.0);
        double sum5 = sumOfNumber(10.0, 20.0, 30.0);
        double sum6 = sumOfNumbers(10.0, 20.0, 30.0, 40.0);
    }


    public static int sumOfNumbers(int n1, int n2) {
        return n1 + n2;
    }

    public static double sumOfNumbers(double n1, double n2) {
        return n1 + n2;
    }

    public static int sumOfNumbers(int n1, int n2, int n3) {
        return sumOfNumbers(n1, n2) + n3;
    }

    public static double sumOfNumber(double n1, double n2, double n3) {
        return sumOfNumbers(n1, n2) + n3;
    }

    public static int sumOfNumber(int n1, int n2, int n3, int n4) {
        return sumOfNumbers(n1, n2, n3) + n4;
    }

    public static double sumOfNumbers(double n1, double n2, double n3, double n4) {
        return sumOfNumber(n1, n2, n3) + n4;
    }
}
