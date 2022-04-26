package day43Abstracation;

import java.util.Scanner;

public class Throw_Throws {


    public static void main(String[] args) {


        System.out.println("write a number");

        int scores = new Scanner(System.in).nextInt();

        if (scores < 0 || scores > 100) {
            throw new RuntimeException("score is not acceptible=" + scores);

        }


        if (scores >= 90) {
            System.out.println("A");
        } else if (scores >= 80) {
            System.out.println("B");
        } else if (scores >= 70) {
            System.out.println("C");
        } else if (scores >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }

    public static void method() throws InterruptedException {

        Thread.sleep(5000);

    }


}


