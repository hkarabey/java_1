package day28ArrayList;

import java.util.ArrayList;

public class ArrayListPractıce {

    public static void main(String[] args) {
        //{1,2,3,4,5,6,}~~~{2,4,6,8,10,12}

        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        for (int i = 0; i < list.size(); i++) {
            list.set(i,2*list.get(i));
        }
        System.out.println(list);
        
    }
    
    
}
