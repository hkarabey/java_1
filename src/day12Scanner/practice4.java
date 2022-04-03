package day12Scanner;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("write your age");
        int age=scan.nextInt();
        System.out.println("age = " + age);
        System.out.println("write yor salary");
        int salary=scan.nextInt();

        System.out.println("age = " + age);
        System.out.println("salary = " + salary);

scan.close();

    }


}
