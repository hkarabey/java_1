package day50Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice_2 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmet", "ahmet", "John", "Ercon", "Daniel", "Mustafa", "Mohammed",
                "Ahmet", "AhMeT", "YULİA"));

        names.removeIf(each->each.equalsIgnoreCase("ahmet"));
        System.out.println(names);
        System.out.println("--------------");

        List<String> names4 = new ArrayList<>();
        names4.addAll(Arrays.asList("Ahmet", "ahmet", "John", "Ercon", "Daniel", "Mustafa", "Mohammed",
                "Ahmet", "AhMeT", "YULİA"));
        Iterator<String> names1 = names4.iterator();
        while (names1.hasNext()) {
            if (names1.next().equalsIgnoreCase("ahmet")) {
                names1.remove();
            }
        }
        System.out.println(names4);
        System.out.println("---------------");


        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Ahmet", "ahmet", "John", "Ercon", "Daniel", "Mustafa", "Mohammed",
                "Ahmet", "AhMeT", "YULİA"));

        for (Iterator<String>names3=names2.iterator(); names3.hasNext();){
            if(names3.next().equalsIgnoreCase("ahmet")){
                names3.remove();
            }
        }

        System.out.println(names2);
    }


}
