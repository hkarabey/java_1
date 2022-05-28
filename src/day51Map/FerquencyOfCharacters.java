package day51Map;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FerquencyOfCharacters {

    public static void main(String[] args) {

        String str="aaabbccccdd";

        Map<String,Integer>result=new LinkedHashMap<>();

      String[]arr=str.split("");

        for (String each : arr) {
            result.put(each, Collections.frequency(Arrays.asList(arr),each));
        }

        System.out.println(result);

    }



}
