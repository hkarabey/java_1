package day27WrapperClasses;

import utilities.ArraysUtılıty;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

      int[]arr={1,1,2,2,2,3,4,5,5,5,6,6,6,7};
      arr=removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));

    }
    //removeDuplicate
    public static int[] removeDuplicates(int[]arr){

        int[] newArray={};

        for (int i = 0; i < arr.length; i++) {

            if (ArraysUtılıty.contains(newArray,arr[i])){
                continue;
            }
            newArray=ArraysUtılıty.addElements(newArray,arr[i]);
        }

return newArray;
    }


}
