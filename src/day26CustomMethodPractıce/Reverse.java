package day26CustomMethodPractıce;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[]arr1={1,2,3,4,5,6};
        System.out.println(Arrays.toString(reverse(arr1)));

    }
        //reverse array to array
        public static int[] reverse ( int[] arr){
            int[] newArray = new int[arr.length];
            int j = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                newArray[j++] = arr[i];

            }
            return newArray;
        }

    }
