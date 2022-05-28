package day51Map;

import java.util.*;

public class MapIterations {

    public static void main(String[] args) {
        Map<String,Integer>students1=new HashMap<>();
        students1.put("eda",90);
        students1.put("maria",67);
        students1.put("ali",34);
        students1.put("alex",78);

        /*
        Set<String >keys=students1.keySet();

        for (String eachKey : keys) {
            System.out.println(eachKey+" : "+students1.get(eachKey));
        }

         */

        for (String eacKey : students1.keySet()) {

            Integer eachValue=students1.get(eacKey);
            if (eachValue<50){
                students1.remove(eacKey);
            }
        }
        System.out.println(students1);

        Map<String,Integer>earlybirds=new HashMap<>();
        Map<String,Integer>angrybirds=new HashMap<>();

        for (String key : students1.keySet()) {
            Integer value=students1.get(key);
            if (value>80){
                earlybirds.put(key,value);
            }
        }
        System.out.println(earlybirds);

        for (String key : students1.keySet()) {
            Integer value=students1.get(key);
            if (value<50){
                angrybirds.put(key,value);
            }
        }
        System.out.println(angrybirds);

        Set<String>names=students1.keySet();

        Collection <Integer> scores=students1.values();
        List<Integer>scoress=new ArrayList<>(students1.values());
        System.out.println("------------");

        int maxScore=Integer.MIN_VALUE;
        int minScore=Integer.MAX_VALUE;

        for (Integer each : students1.values()) {
            if (each>maxScore){
                maxScore=each;
            }
        }
        System.out.println(maxScore);

        for (Integer each : students1.values()) {
            if (each<minScore){
                minScore=each;
            }
        }
        System.out.println(minScore);

        int max=Collections.max( students1.values() );
        int min=Collections.min( students1.values() );

        //how many students get the score above of 50

        int coun=0;

        for (Integer each : students1.values()) {
            if (each>50){
                coun++;
            }
        }
        System.out.println(coun);

        int count=0;

        for (String each : students1.keySet()) {

          Integer value= students1.get(each);
            if (value>50){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("--------------");
        for (Map.Entry<String, Integer> entry : students1.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }

    }

}
