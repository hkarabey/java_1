package day51Map;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {


        //student name and score

        //Map<String,Integer>students=new LinkedHashMap<>();//insertion order
        Map<String,Integer>students1=new HashMap<>();//random order
        //Map<String,Integer>students3=new TreeMap<>();//ascending order

        students1.put("eda",90);
        students1.put("maria",67);
        students1.put("ali",34);
        students1.put("alex",78);

        students1.put("alex",90);
        System.out.println("-----size------");
        System.out.println(students1);
        System.out.println("students1.size() = " + students1.size());
        System.out.println("-------get-------");
       int edasnote= students1.get("eda");
        System.out.println(edasnote);
        System.out.println("------replace------");
        students1.replace("ali",98);
        System.out.println(students1);
        System.out.println("------remove------");
        students1.remove("eda");
        System.out.println(students1);
        System.out.println("---------containsKey------");
        boolean r1=students1.containsKey("halil");
        System.out.println(r1);
        System.out.println("---------containsValue---");
        boolean r2=students1.containsValue(98);
        System.out.println(r2);
        System.out.println("----isEmpty------");
        System.out.println("students1.isEmpty() = " + students1.isEmpty());
        System.out.println("--------equals-------");
        Map<String,Integer>map1=new HashMap<>();
        map1.putAll(students1);
        Map<String,Integer>map2=new HashMap<>();
        map2.putAll(students1);
        System.out.println("map1.equals(map2) = " + map1.equals(map2));
        System.out.println("----------clear-----");
        map1.clear();
        System.out.println(map1);
        System.out.println("-----------keySet-------");

    }
}
