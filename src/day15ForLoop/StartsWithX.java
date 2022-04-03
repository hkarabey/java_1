package day15ForLoop;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
String word1=scan.next();//xcodex
        if (word1.charAt(0)=='x'){
            System.out.println(word1.replaceFirst("x","a"));
        }


scan.close();

    }



}
