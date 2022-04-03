package day15ForLoop;

import java.util.Locale;

public class FirstİsUpperOthersLover {
    public static void main(String[] args) {
        String firstName="cyDEo";
        String lastName="schoOl";

       String s1= firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();

       String s2=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(s1);
        System.out.println(s2);

        String s3=(""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
        System.out.println(s3);

    }


}
