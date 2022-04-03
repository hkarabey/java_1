package day20Array;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
//10,20,50,70

        int[] elements = {10, 20, 50, 70};//size is 4
        System.out.println(Arrays.toString(elements));
        System.out.println(elements[1]);

        //create a variable that it contains 5 scores
        System.out.println("-----------");
        int [] scores=new int[5];

        scores[1]=60;
        scores[2]=70;
        scores[3]=80;
        scores[4]=90;
        System.out.println(Arrays.toString(scores));
        System.out.println("---------------");

        String[]months={"january","february","march","aprıl","may","june","july",
        "august","september","october","november","december"};
/*
        System.out.println(months[0] );
        System.out.println(months[1]);
        System.out.println(months[2] );
        System.out.println(months[3]);
        System.out.println(months[4] );
        System.out.println(months[5]);
        System.out.println(months[6] );
        System.out.println(months[7]);
        System.out.println(months[8] );
        System.out.println(months[9]);
        System.out.println(months[10] );
        System.out.println(months[11]);
  */

        for (int i = 0; i <=months.length-1 ; i++) {
            System.out.println(months[i]);

        }
    }


}
