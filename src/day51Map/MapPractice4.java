package day51Map;

import java.lang.reflect.Array;
import java.util.*;

public class MapPractice4 {

    public static void main(String[] args) {
/*      String[]group1={"A","B","C","D"};
        String[]group2={"MARGİE","VESELE","IRYN","NİLUFER","AZİZA","NURCAN","RAİKA","IGOR","ELİF","SANA","AZAMAT"};
        String[]group9={"H","I"};
        String[]group24={"HALİL","ASLI","CEYLİN","MARİA","CAREN"};
        String[]group5={"NAZAR","VERONİKA","MİKAEL","LAYLA","BADMAA","ZAEİR","ANNA","TAMARRA","EUGENE"};
*/

        ArrayList<String>group1=new ArrayList<>();
        ArrayList<String>group2=new ArrayList<>();
        ArrayList<String>group9=new ArrayList<>();
        ArrayList<String>group24=new ArrayList<>();
        ArrayList<String>group5=new ArrayList<>();

        group1.addAll(Arrays.asList("A","B","C","D"));
        group2.addAll(Arrays.asList("MARGİE","VESELE","IRYN","NİLUFER","AZİZA","NURCAN","RAİKA","IGOR","ELİF","SANA","AZAMAT"));
        group9.addAll(Arrays.asList("H","I"));
        group24.addAll(Arrays.asList("HALİL","ASLI","CEYLİN","MARİA","CAREN"));
        group5.addAll(Arrays.asList("NAZAR","VERONİKA","MİKAEL","LAYLA","BADMAA","ZAEİR","ANNA","TAMARRA","EUGENE"));



        Map<Integer, ArrayList<String>>groups=new TreeMap<>();
        groups.put(1,group1);
        System.out.println(groups);

        groups.put(2,group2);
        groups.put(3,group9);
        groups.put(4,group24);
        groups.put(5,group5);
        System.out.println("groups = " + groups);

        for (String each : groups.get(4)) {
            System.out.println(each);
        }
        System.out.println("groups.get(4).get(2) = " + groups.get(4).get(2));


    }


}
