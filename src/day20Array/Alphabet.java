package day20Array;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {


        char[] alphabets = new char[26];//z~~a

     /*   alphabets[0]='z';

        char ch='z';
        for (char i =0 ; i <=alphabets.length-1 ; i++) {
            alphabets[i]=ch--;
        }

*/

        for (char i = 0, j='z'; i <alphabets.length ; i++,j--) {
            alphabets[i]=j;

        }


        System.out.println(Arrays.toString(alphabets));
        System.out.println(alphabets[0]);//write only one element
    }
}
