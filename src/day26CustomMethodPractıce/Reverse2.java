package day26CustomMethodPractıce;

import utilities.ArraysUtılıty;

import java.util.Arrays;

public class Reverse2 {

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int[]res=reverse(arr);
        System.out.println(Arrays.toString(res));


    }


    public static int[] reverse(int[] arr){
        int[]result={};
        for (int i = arr.length-1; i >=0 ; i--) {
            result=ArraysUtılıty.addElements(result,arr[i]);

        }
    return result;
    }
}
