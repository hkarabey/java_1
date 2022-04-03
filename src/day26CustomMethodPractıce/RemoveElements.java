package day26CustomMethodPractıce;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {

        int[]arr={10,20,30,40};
        int[]newArrays=removeElements(arr,2);
        System.out.println(Arrays.toString(newArrays));

    }
    //remove elements from array to NEW ARRAY
    public static int[] removeElements(int[]arr,int elements){

        if(elements<=0||elements> arr.length-1){
            System.out.println("invalid index");
            System.exit(0);
        }
        int[]newArray=new int[arr.length-1];
        int j=0;
        for (int i = 0; i < arr.length; i++) {

            if (elements==i){
                continue;
            }
          newArray[j]=arr[i];
            j++;
        }
        return newArray;
    }


}
