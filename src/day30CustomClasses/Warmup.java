package day30CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Warmup {
    public static void main(String[] args) {
        //swap first and last elements of arraylist

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);

        int[]arr={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));

        System.out.println("------------");

        ArrayList<Integer>list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer>list2=new ArrayList<>();

        System.out.println("list1 = " + list1);


        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i)!=0){
                list2.add(list1.get(i));
            }

        }
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i)==0){
                list2.add(list1.get(i));
            }

        }

        System.out.println(list2);
    }




}
