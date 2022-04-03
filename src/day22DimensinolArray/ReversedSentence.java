package day22DimensinolArray;

import java.util.Arrays;

public class ReversedSentence {
    public static void main(String[] args) {

        String sentence="today is a good day for learning java";
String[]word=sentence.split(" ");

        System.out.println(Arrays.toString(word));
        String reverse="";

        for (int i = word.length-1; i >=0; i--) {
            reverse+=word[i]+" ";


        }
        System.out.println(reverse);
    }



}
