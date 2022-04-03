package day26CustomMethodPractıce;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {

        int []arr1={1,2,3,4};
        int[]arr2={5,6,7};
        int[]a=mergeArray(arr1,arr2);
        System.out.println(Arrays.toString(a));
    }

    //merge the given two arrays and return new array
    public static int[] mergeArray(int[]arr1,int[]arr2){
        int[]newArray= new int[arr1.length+arr2.length];
int j=0;
        for (int i = 0; i < arr1.length; i++) {
            newArray[j]=arr1[i];
            j++;
        }
        for (int i = 0; i < arr2.length; i++) {
            newArray[j]=arr2[i];
            j++;
        }

return newArray;
    }

}
