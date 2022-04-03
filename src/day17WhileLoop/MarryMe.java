package day17WhileLoop;

import java.util.Scanner;

public class MarryMe {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("will you marry me? yes/no");
        String answer=scan.next();

        while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.out.println("invalid answer please write your answer again");
            answer=scan.next();
        }
        System.out.println((answer.equalsIgnoreCase("yes"))?"thank you":"good bye" );


        scan.close();
    }



}
