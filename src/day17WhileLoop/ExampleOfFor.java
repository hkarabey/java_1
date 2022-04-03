package day17WhileLoop;

import java.util.Scanner;

public class ExampleOfFor {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a word");
        String word=scan.nextLine();
        System.out.println("Write a character");
        String ch=scan.next();
        int chInclude=0;
        for (int i = 0; i < word.length(); i++) {
         if (ch.equalsIgnoreCase(String.valueOf(word.charAt(i)))){
             chInclude+=1;
         }

        }
        System.out.println(chInclude);




        scan.close();
    }



}
