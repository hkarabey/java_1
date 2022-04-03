package day15ForLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        //ask to user enter a number 5 times
        //return the max number
        Scanner scan=new Scanner(System.in);

        int maxNumber=-2147483648;
        for (int i = 0; i < 5; i++) {

            System.out.println("enter a number:");
            int num= scan.nextInt();

            if (num>maxNumber){
                maxNumber=num;
            }

        }
        System.out.println("max number= "+maxNumber);
        scan.close();
    }



}
