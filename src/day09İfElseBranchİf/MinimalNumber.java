package day09İfElseBranchİf;

public class MinimalNumber {
    public static void main(String[] args) {
        int n1 = 200;
        int n2 = 100;

        boolean min1 = n1 > n2;
        boolean min2 = n1 < n2;
        boolean equal = n1 == n2;
        if (min1) {
            System.out.println("minimal number is " + n1);
        }

        if (min2) {
            System.out.println("minimal number is " + n2);
        }

        if (equal) {
            System.out.println("equal minimal number " + n1 + "and" + n2);
        }


    }


}
