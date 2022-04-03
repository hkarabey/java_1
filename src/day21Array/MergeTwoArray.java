package day21Array;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {

        String []group1={"ali","veli"};
        String []group2={"kırkdokuz","elli"};

        String[] result=new String[group1.length+ group2.length];
int i=0;
        for (String each : group1) {
            result[i]=each;
            i++;
        }
        for (String each : group2) {
            result[i]=each;
            i++;
        }
        System.out.println(Arrays.toString(result));

        char[]ch1={'a','b','c'};
        char[]ch2={'d','e','f','g'};
        char chars[]=new char[ch1.length+ ch2.length];
int j=0;
        for (char ch : ch1) {
            chars[j]=ch;
            j++;
        }
        for (char ch : ch2) {
            chars[j]=ch;
            j++;
        }
        System.out.println(Arrays.toString(chars));


    }



}
