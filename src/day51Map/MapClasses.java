package day51Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        Map<Integer,String> hashMap=new HashMap<>();
        hashMap.put(10,"halil");
        hashMap.put(8,"aylin");
        hashMap.put(12,"alexandra");
        hashMap.put(4,"emma");
        hashMap.put(3,"ısabella");
        hashMap.put(-11,"ısabella");
        hashMap.put(null,"cihan");
        hashMap.put(null,"hulya");
        hashMap.put(1,null);
        hashMap.put(2,null);

        System.out.println(hashMap);

        Map<Integer,String> map2=new LinkedHashMap<>();

        Map<Integer,String> map3=new TreeMap<>();
        Map<Integer,String> map4=new Hashtable<>();




    }


}
