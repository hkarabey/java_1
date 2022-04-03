package day15ForLoop;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int minNmuber=2147483647;

        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number");
            int num=scan.nextInt();
            if (num<minNmuber) {
                minNmuber=num;
            }

        }

        System.out.println("min number: "+minNmuber);

        scan.close();
    }


}
