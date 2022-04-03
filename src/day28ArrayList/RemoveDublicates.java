package day28ArrayList;

import java.util.ArrayList;

public class RemoveDublicates {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        System.out.println(list);

        ArrayList<Integer> removeDuplicates=new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int li=list.get(i);
            if (removeDuplicates.contains(li)){
                continue;
            }
            removeDuplicates.add(li);

        }
        System.out.println(removeDuplicates);

    }

}
