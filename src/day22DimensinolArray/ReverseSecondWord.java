package day22DimensinolArray;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {

        String sentence="I love JAVA";

        String []arrSentence=sentence.split(" ");
        System.out.println(Arrays.toString(arrSentence));

        String reverse="";

        for (int i=arrSentence[1].length()-1;i>=0;i--){
            reverse+=arrSentence[1].charAt(i);
        }
        System.out.println(reverse);

        System.out.println(sentence.replace(arrSentence[1],reverse));



    }



}
