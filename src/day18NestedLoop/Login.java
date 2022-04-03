package day18NestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("write your user name");
        String usNmae= scan.next();

        System.out.println("write your password");
        String pasWord=scan.next();

        if (usNmae.equals("halil")&&pasWord.equals("karabey")){

            System.out.println("login");

        }else {

            for (int i = 1; i < 4; i++) {
                System.out.println("incorrect user name or password");
                System.out.println("enter your user name");
                usNmae=scan.next();
                System.out.println("write your password");
                pasWord=scan.next();
                if (usNmae.equals("halil")&&pasWord.equals("karabey")){
                    System.out.println("login");
                    break;
                }
                if (!(usNmae.equals("halil")&&pasWord.equals("karabey"))){
                    System.out.println("your account is locked");
                }
            }
        }



scan.close();
    }



}
