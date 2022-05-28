package day51Map;

import day30CustomClasses.Employee;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {

        Map<String,String >employeeMap=new HashMap<>();
        employeeMap.put("didem","f");
        employeeMap.put("winfred","m");
        employeeMap.put("jereme","m");
        employeeMap.put("glad","f");
        employeeMap.put("makalina","f");
        employeeMap.put("bertrando","m");
        employeeMap.put("ajay","f");
        employeeMap.put("brigitte","f");

        for (String key : employeeMap.keySet()) {
         if (employeeMap.get(key).equals("m")){
             employeeMap.replace(key,"male");
         }
         if (employeeMap.get(key).equals("f")){
             employeeMap.replace(key,"female");
         }
        }
        System.out.println("employeeMap = " + employeeMap);

        for (Map.Entry<String, String> each : employeeMap.entrySet()) {

            if (each.getValue().equals("female")){
                //employeeMap.replace(each.getKey(),"f");
                each.setValue("f");
            }
            if (each.getValue().equals("male")){
                each.setValue("m");
                //employeeMap.replace(each.getKey(), "m");
            }
        }
        System.out.println("employeeMap = " + employeeMap);


        for (Map.Entry<String, String> eachPair : employeeMap.entrySet()) {
            if (eachPair.getValue().equals("m")) {
                System.out.println(eachPair);
            }

                String eachkey = eachPair.getKey();
                String eachValue = eachPair.getKey();

                if (eachPair.getValue().equals("f")){
                    System.out.println("eachPair.getKey() = " + eachPair.getKey());
                }

            }
        }



    }



