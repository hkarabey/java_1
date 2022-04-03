package day25OverLoadıngRecaps;

public class SumOfNumbers {
    public static void main(String[] args) {

        System.out.println(sum2(12,23));
        System.out.println(sum3(1, 23, 23));
        System.out.println(sum4(1, 2, 3, 4));
    }

    public static int sum2(int n1, int n2) {
        int sumOf2 = n1 + n2;
        return sumOf2;
    }

    public static int sum3(int n1, int n2, int n3) {
        int sumOf3 = n1 + n2 + n3;
        return sumOf3;
    }

    public static int sum4(int n1, int n2, int n3, int n4) {
        int sumOf4 = n1 + n2 + n3 + n4;
        return sumOf4;
    }
}
