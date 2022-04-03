package day17WhileLoop;

import java.util.Scanner;

public class WhileLogin {
    public static void main(String[] args) {

        //userName:CYDEO
        //password:cydeo123
        Scanner scan = new Scanner(System.in);

        System.out.println("write user name");
        String userName = scan.next();

        System.out.println("write your password");
        String passWord = scan.next();


        if (userName.equalsIgnoreCase("cydeo") && passWord.equalsIgnoreCase("cydeo123")) {

            System.out.println("logged in");

        } else {
            int attempt = 2;
            while (!(userName.equalsIgnoreCase("cydeo")&&passWord.equalsIgnoreCase("cydeo123"))&&attempt>0){
                if (attempt==1) {
                    System.out.println("this is your last chance");
                }


                    System.out.println("ıncorrect user name or password re enter ");

                System.out.println("enter your user name");
                userName= scan.next();
                System.out.println("enter password");
                passWord= scan.next();
                attempt--;

            }
            if (userName.equalsIgnoreCase("cydeo")&&passWord.equalsIgnoreCase("cydeo123")){
                System.out.println("logged in");
            }else{
                System.out.println("your account is locked");
            }
        }


        scan.close();
    }


}
