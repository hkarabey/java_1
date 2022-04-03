package day21Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        String str1="acdb";
        String str2="abcd";

        //does it contain same characters

        char[]ch1=str1.toCharArray();
        char[]ch2=str2.toCharArray();
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println();
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        boolean anagram=Arrays.equals(ch1,ch2);
        System.out.println("anagram: "+anagram);

        String sentence="wooden spoon";
        String[]a=sentence.split(" ");
        System.out.println(Arrays.toString(a));

        String email="woodenSpoon@cydeo.com";
        String a1 []=email.split("@");
        System.out.println(Arrays.toString(a1));

        System.out.println("--------------");

        String s="today is nice day. Today we learn java. Today Monday";
        String[]sarray=s.split("\\. ");
        System.out.println(Arrays.toString(sarray));



    }

}
