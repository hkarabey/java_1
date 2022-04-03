package day20Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("how many numbers would you like to enter?");
        int length= scan.nextInt();
        if (length<=0){
            System.out.println("invalid entry");
            System.exit(0);
        }


        int[]numbers=new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("enter a number");
             numbers[i]=scan.nextInt();

        }
        System.out.println("entered numbers are:  "+Arrays.toString(numbers));


    }



}
