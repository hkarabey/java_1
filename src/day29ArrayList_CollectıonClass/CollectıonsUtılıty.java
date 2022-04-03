package day29ArrayList_CollectıonClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectıonsUtılıty {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        //sort

        Collections.sort(list);
        System.out.println(list);

        //reverse

        ArrayList<Character>list2=new ArrayList<>();
        list2.addAll(Arrays.asList('a','b','c','d','e','f','g'));
        System.out.println(list2);

        Collections.reverse(list2);
        System.out.println(list2);

        //swap

        ArrayList<Integer>list3=new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));
        Collections.swap(list3,1,4);
        System.out.println(list3);

        //max

       int max= Collections.max(list3);
       int min= Collections.min(list3);
        System.out.println("max number is "+max);
        System.out.println("min number is "+min);

        System.out.println("---------------");

        // replaceAll

        ArrayList<Integer>list4=new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));

        Collections.replaceAll(list4,10,100);
        System.out.println(list4);

        //frequency

        int frequency=Collections.frequency(list4,100);

        System.out.println("frequency of 100 is "+frequency);

        System.out.println("----------------");
        ArrayList<String> words=new ArrayList<>();
        words.addAll(Arrays.asList("java","python","java","python","c++","rub","python"));

        int frequency1=Collections.frequency(words,"java");

        System.out.println("frequency of java is "+frequency1);

    }



}
