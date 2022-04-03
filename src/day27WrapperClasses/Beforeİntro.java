package day27WrapperClasses;

import java.util.Arrays;

public class Beforeİntro {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 7, 9};
        int[] arr1 = replace(arr, 2, 20);
        System.out.println(Arrays.toString(arr1));

        String []arrrrr={"aaa","bbb","ccc","dddd"};
        arrrrr=replace(arrrrr,2,"qqqqq");
        System.out.println(Arrays.toString(arrrrr));


        int[]arrr={1,2,3,4,5,1,1,5,9};
        arrr=replaceAll(arrr,1,10);
        System.out.println(Arrays.toString(arrr));
    }
    //replace
    public static int[] replace(int[] arr, int index, int element) {

        int[] newArray = new int[arr.length];

        int j = 0;
        for (int i = 0; i < arr.length; i++, j++) {
            if (index < 0 || index > arr.length) {
                System.exit(0);
            }
            if (i == index) {
                newArray[j] = element;
            } else {
                newArray[j] = arr[i];
            }
        }
        return newArray;
    }

    //replace
    public static String[] replace(String[] arr, int index, String element) {

        String[] newArray = new String[arr.length];

        int j = 0;
        for (int i = 0; i < arr.length; i++, j++) {
            if (index < 0 || index > arr.length) {
                System.exit(0);
            }
            if (i == index) {
                newArray[j] = element;
            } else {
                newArray[j] = arr[i];
            }
        }
        return newArray;
    }


    // replace all elements if elements = choosing elements
    public static int[] replaceAll(int[]arr, int element, int elementNew){

        int[]newArray=new int[arr.length];

        int j=0;
        for (int i = 0; i < arr.length; i++,j++) {
            if (element==arr[i]){
                newArray[j]=elementNew;
            }
            else {newArray[j]=arr[i];
            }
        }
        return newArray;
    }

}
