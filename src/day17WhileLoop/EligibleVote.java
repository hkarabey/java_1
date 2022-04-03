package day17WhileLoop;

import java.util.Scanner;

public class EligibleVote {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("write your age");
        int age=scan.nextInt();

        while(!(age>=18)){
            System.out.println("you are not eligible to wrote, please write anonther voters age");
             age= scan.nextInt();
        }

        System.out.println("are you US citizen yes? or no?");
        String answer=scan.next();
        while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.out.println("you are not write valid answer please re-enter  ");
            answer=scan.next();
        }
if (age>=18&&answer.equalsIgnoreCase("yes")){
    System.out.println("you are eligible to vote");
}else{
    System.out.println("you are not eligible to vote");
}

scan.close();
    }



}
