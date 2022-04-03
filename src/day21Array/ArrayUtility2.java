package day21Array;

import java.util.Arrays;

public class ArrayUtility2 {
    public static void main(String[] args) {

        String[]students={"elif","sinem","gunay","cihad","david","james","aoron","daniel"};
        students= Arrays.copyOf(students,3);
        System.out.println(Arrays.toString(students));

        System.out.println("-------------");

        int[]numbers={1,2,3,4,5,6,7,8,9,10};
        numbers=Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(numbers));
        numbers=Arrays.copyOfRange(numbers,2,5);
        System.out.println(Arrays.toString(numbers));
        System.out.println("-------------");

        char[]ch1={'a','b','c','d','e','f','g','h','ı'};
        char[]ch2=Arrays.copyOfRange(ch1,2,6);
        System.out.println(Arrays.toString(ch2));

        int[]scores={10,20,30,40,50,60,70,80,90,100};
        int[]result=Arrays.copyOfRange(scores,3,16);//[)
        System.out.println(Arrays.toString(result));

        int[]resul=Arrays.copyOfRange(scores,5, scores.length);
        System.out.println(Arrays.toString(resul));
    }




}
