package day25OverLoadıngRecaps;

import utilities.ArraysUtılıty;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        ArraysUtılıty.printEach(arr);

        double[] arr2 = {1.1, 2.1, 3.1, 4.1};
        ArraysUtılıty.printEach(arr2);

        String[] arr3 = {"ali", "veli", "kırkdokuz"};
        ArraysUtılıty.printEach(arr3);

        char[] arr4 = {'a', 'b', 'c', 'd'};
        ArraysUtılıty.printEach(arr4);

        int[]arr5={1,2,3,4,5,9,7};
         int max=ArraysUtılıty.maxNumberr(arr5);
        System.out.println(max);
        double[]arr6={1.2,9.1,3.4,5.2};
        double max2=ArraysUtılıty.maxNumberr(arr6);
        System.out.println(max2);

        int []arr7={1,2,3,4,5};
        boolean a5=ArraysUtılıty.contains(arr7,4);
        System.out.println(a5);
    }


}
