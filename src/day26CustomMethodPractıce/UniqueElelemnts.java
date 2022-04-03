package day26CustomMethodPractıce;

import utilities.ArraysUtılıty;

import java.util.Arrays;

public class UniqueElelemnts {
    public static void main(String[] args) {

        int[] arr = {11, 2, 2, 33, 4, 4, 5, 5, 6, 77, 8, 99, 0};
        int[] arr1 = unique(arr);
        System.out.println(Arrays.toString(arr1));

        double[] arr2 = {1.1, 21, 1.1, 22.4, 21, 3.5};
        double[] uniguArr2 = unique(arr2);
        System.out.println(Arrays.toString(uniguArr2));

        char[] arr3={'a','s','a','d','e'};
        System.out.println(Arrays.toString(unique(arr3)));

    }

    //returns the unique elements of the array as a array
    public static int[] unique(int[] arr) {
        int[] result = {};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if (count == 1) {
                result = ArraysUtılıty.addElements(result, arr[i]);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a array
    public static double[] unique(double[] arr) {
        double[] result = {};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if (count == 1) {
                result = ArraysUtılıty.addElements(result, arr[i]);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a array
    public static char[] unique(char[]arr){
        char[] result={};
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }

            }
            if (count==1){
                result=ArraysUtılıty.addElements(result,arr[i]);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a array
    public static String[] unique(String[]arr){
        String[] result={};
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }

            }
            if (count==1){
                result=ArraysUtılıty.addElements(result,arr[i]);
            }
        }
        return result;
    }
}
