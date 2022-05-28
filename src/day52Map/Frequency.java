package day52Map;

import java.lang.reflect.Array;
import java.util.*;

public class Frequency {

    public static void main(String[] args) {

        String str="eeeeeeeddfffggtt";

        Map<String,Integer>map1=new LinkedHashMap();

        String[]arr=str.split("");

        for (String each : arr) {
            map1.put(each, Collections.frequency(Arrays.asList(arr),each));
        }
        System.out.println(map1);

        int maxNumber=Integer.MIN_VALUE;
        for (Integer each : map1.values()) {
            if (maxNumber<each){
                maxNumber=each;
            }
        }

        System.out.println(maxNumber);

        ArrayList<String>list=new ArrayList<>();
        list.addAll(Arrays.asList("java","python","java","#c"));
        System.out.println(list);
      String []arr1=new String[list.size()];

        for (int i = 0,j=0; i < list.size(); i++,j++){


            arr1[j]=list.get(i);
        }

        Map<String,Integer>map2=new LinkedHashMap<>();

        int max=0;
        String element="";
        for (String each : list) {

            int frequency=Collections.frequency(list,each);


            map2.put(each,frequency);

            if (frequency>max){
                max=frequency;
                element=each;
            }

        }
        System.out.println(map2);
        System.out.println("element "+element+" has the higest frequency");
    }

}
