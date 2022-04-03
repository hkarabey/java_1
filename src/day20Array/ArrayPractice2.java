package day20Array;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
     char []letters=new char[26];
/*
        for (char i = 'a',j=0; i <='z'&&j<letters.length ; i++,j++) {

            letters[j]=i;
  */
       char ch='a';
        for (int i = 0; i < letters.length; i++) {
            letters[i]=ch++;

        }



        System.out.println(Arrays.toString(letters));


    }


}
