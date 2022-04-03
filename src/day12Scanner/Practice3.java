package day12Scanner;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("write your name and surname");
        String nameAndSurname=input.nextLine();

        System.out.println("enter your programing language");
        String prgLanguage=input.nextLine();

        System.out.println("write your age");
        int age=input.nextInt();

        input.nextLine();// above this line it is not next line so finish the  enter therefore we must write new nexline method

        System.out.println("write your school name");
        String schoolNmae=input.nextLine();

        System.out.println(nameAndSurname);
        System.out.println(prgLanguage);
        System.out.println("age = " + age);
        System.out.println("schoolNmae = " + schoolNmae);



input.close();


    }


}
