package day25OverLoadıngRecaps;

import java.util.Arrays;

public class AddElementToArrayOverLoading {
    public static void main(String[] args) {

        int[] arrInt={1,2,3,4};//5
        char[] arrChar={'a','b','c'};//İ
        double[] arrDouble={1.1,1.2,1.3};//1.4
        String[] arrString={"ali","veli","kırkdokuz"};//elli

        arrInt=addElement(arrInt,5);
        arrChar=addElement(arrChar,'i');
        arrString=addElement(arrString,"elli");
        arrDouble=addElement(arrDouble,1.4);

        System.out.println(Arrays.toString(arrChar));
        System.out.println(Arrays.toString(arrDouble));
        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.toString(arrString));

    }

    public static String[] addElement(String[] arr, String element) {

        String[] result=new String[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            result[i]=arr[i];

        }
        result[result.length-1]=element;
        return result;
    }
    public static int[] addElement(int[] arr, int element) {

        int[] result=new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            result[i]=arr[i];

        }
        result[result.length-1]=element;
        return result;
    }
    public static char[] addElement(char[] arr, char element) {

        char[] result=new char[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            result[i]=arr[i];

        }
        result[result.length-1]=element;
        return result;
    }
    public static double[] addElement(double[] arr, double element) {

        double[] result=new double[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            result[i]=arr[i];

        }
        result[result.length-1]=element;
        return result;
    }
}
