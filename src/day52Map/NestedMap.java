package day52Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class NestedMap {
    public static void main(String[] args) {

        Map<Integer,String>map1=new LinkedHashMap<>();
        map1.put(11,"sdet");
        map1.put(12,"dev");
        map1.put(13,"scrumMaster");
        map1.put(14,"po");
        map1.put(15,"ba");


        Map<String,Integer>map2=new LinkedHashMap<>();
        map2.put("halil",125_000_000);
        map2.put("eda",130_000_000);
        map2.put("hayal",120_000_000);
        map2.put("alezandra",145_000_000);
        map2.put("george",112_000_000);

        //ıd  jobTitle  name   salary


        Map<Map<Integer,String>, Map<String,Integer>> nestedMap=new LinkedHashMap<>();

        nestedMap.put(map1,map2);

        System.out.println(nestedMap);


        for (Map.Entry<Map<Integer, String>, Map<String, Integer>> entryKey : nestedMap.entrySet()) {

            for (Map.Entry<Integer, String> Map1EntryKey : entryKey.getKey().entrySet()) {
                System.out.println(Map1EntryKey.getValue());
            }
            for (Map.Entry<String, Integer> map2EntryKey : entryKey.getValue().entrySet()) {
                System.out.println(map2EntryKey.getKey());
            }
        }

    }
}
