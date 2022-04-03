package day20Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxWithArrayAndScanner {
    public static void main(String[] args) {

        int []numbers=new int[4];
        Scanner scan=new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter a number");
            numbers[i]=scan.nextInt();



        }
        int min =numbers[0];
        int max=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (min>numbers[i]){
                min=numbers[i];
            }
            if (max<numbers[i]){
                max=numbers[i];
            }
        }
        System.out.println("numbers are :"+ Arrays.toString(numbers));
        System.out.println("max number is: "+max);
        System.out.println("min number is: "+min);
    }


}
