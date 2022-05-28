package day51Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {

        Map<String,Integer>map=new LinkedHashMap<>();
        map.put("john",123);
        map.put("antony",120);
        map.put("halil",135);
        map.put("elif",112);
        map.put("steven",134);

        int maxSalary=Integer.MIN_VALUE;
        String name="";

        for (Map.Entry<String, Integer> each : map.entrySet()) {
            if (each.getValue()>maxSalary){
                maxSalary=each.getValue();
                name=(each.getKey());
            }


        }

        System.out.println(name);

        int minSalary=Integer.MAX_VALUE;
        String nameHasMinSalary="";

        for (Map.Entry<String, Integer> each : map.entrySet()) {
            if (each.getValue()<minSalary){
                minSalary= each.getValue();
                nameHasMinSalary= each.getKey();
            }

        }

        System.out.println(minSalary);
        System.out.println(nameHasMinSalary);

        int count=0;
        for (Map.Entry<String, Integer> each : map.entrySet()) {
            if (each.getValue()>100&&each.getValue()<150){
                each.setValue(each.getValue()+1);
                count++;
            }
        }
        System.out.println(count);
        System.out.println(map);


    }



}
