package day19;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        while (true) {
            System.out.println("enter a number");
            int number = scan.nextInt();
            if (number % 2 == 0) {
                System.out.println("even number");
            } else {
                System.out.println("odd number");
            }
            System.out.println("would you like to anothor number?yes or no");
            String answer = scan.next();
if (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
    System.exit(0);
}
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("thank you");
                break;
            }

        }
scan.close();
    }



}
