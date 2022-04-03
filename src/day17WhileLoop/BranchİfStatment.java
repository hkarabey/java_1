package day17WhileLoop;

import java.util.Scanner;

public class BranchİfStatment {
    public static void main(String[] args) {
        for (char i = 'A'; i <='Z' ; i++) {

            if (i=='F'){
                break;
            }

            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("----------");

        Scanner scan=new Scanner(System.in);

        while(true){

            System.out.println("enter a number: ");
            int n= scan.nextInt();
            if (n<0){
                break;
            }
        }


    }




}
