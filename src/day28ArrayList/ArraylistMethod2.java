package day28ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistMethod2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("-------add-----------");
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);
        System.out.println("----------remove-------");
        int num1=1;
        list.remove(num1);
        System.out.println(list);
        list.remove(0);

        Integer num=200;
        list.remove(num);
        System.out.println(list);

        System.out.println("---------clear----------");
        System.out.println(list);
        System.out.println(list.size());

        list.clear();
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("------isEmpty---------");
        boolean l1=list.isEmpty();
        System.out.println(l1);

        System.out.println("--------ındexOf--lastIndexOf------");

        ArrayList<Character> characters=new ArrayList<>();
        characters.add('a');
        characters.add('a');
        characters.add('a');
        characters.add('a');
        characters.add('a');
        int ind=characters.indexOf('a');
        int lastInd=characters.lastIndexOf('a');
        System.out.println(ind);
        System.out.println(lastInd);

        System.out.println("--------contains---------");

       boolean r1= characters.contains('a');
       boolean r2=characters.contains('z');
        System.out.println(r1);
        System.out.println(r2);

        System.out.println("----------equals-----------");

        ArrayList<Integer> list1= new ArrayList<>();

        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2= new ArrayList<>();

        list2.add(100);
        list2.add(100);
        list2.add(100);
        System.out.println(list1==list2);
        System.out.println(list1.equals(list2));

        System.out.println("----------containsAll----------");

        ArrayList<Integer> numbers= new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5));

    }


}
