package day25OverLoadıngRecaps;

import java.util.Arrays;

public class AddNumberArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        array = addInteger(array, 5);
        System.out.println(Arrays.toString(array));

        double[] arr2 = {1.1, 1.2, 1.3, 1.4};
        arr2 = addDouble2(arr2, 1.5);
        System.out.println(Arrays.toString(arr2));

        char[] array3 = {'a', 'b', 'c', 'd'};
        array3 = addChar(array3, 'e');
        System.out.println(Arrays.toString(array3));

        String[]array4={"ali","veli","kırkdokuz"};
        array4=addString(array4,"elli");
        System.out.println(Arrays.toString(array4));
    }

    public static int[] addInteger(int[] arr, int n1) {

        int[] newArray = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];

        }
        newArray[arr.length] = n1;


        return newArray;
    }

    public static double[] addDouble2(double[] array, double n1) {
        double[] newArray = new double[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = n1;
        return newArray;
    }

    public static char[] addChar(char[] arrays, char ch) {
        char[] newArray = new char[arrays.length + 1];
        for (int i = 0; i < arrays.length; i++) {
            newArray[i] = arrays[i];
        }
        newArray[arrays.length] = ch;
        return newArray;
    }

    public static String[] addString(String[] arrays, String ch) {
        String[] newArray = new String[arrays.length + 1];
        for (int i = 0; i < arrays.length; i++) {
            newArray[i] = arrays[i];
        }
        newArray[arrays.length] = ch;
        return newArray;
    }
}
