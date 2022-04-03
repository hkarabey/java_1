package day13String;

import java.util.Scanner;

public class ScaChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("write your first name");
        String firstName = scan.next();

        System.out.println("write your second name");
        String secondName = scan.next();


        char f = firstName.charAt(0);
        char l = secondName.charAt(0);

        String inital=f+l+"";
        String inital2=""+f+l;

        System.out.println(firstName.charAt(0) + "." + secondName.charAt(0));
        System.out.println(f + "."+l);
        System.out.println(inital);
        System.out.println(inital2);
        scan.close();
    }

}
