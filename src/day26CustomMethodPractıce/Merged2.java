package day26CustomMethodPractıce;

import utilities.ArraysUtılıty;

public class Merged2 {

    public static int[]merge(int[]arr1,int[]arr2){
        int[]result={};

        for (int each : arr1) {
            result=ArraysUtılıty.addElements(result,each);
        }
        for (int each : arr2) {
            result=ArraysUtılıty.addElements(result,each);
        }
return result;
    }
}
