package day29ArrayList_CollectıonClass;

import utilities.ArraysUtılıty;
import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UnıqueElements {

    public static void main(String[] args) {

        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>unıque=new ArrayList<>();

        list1.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        for (Integer each : list1) {
            if(Collections.frequency(list1,each)==1){
                unıque.add(each);
            }

        }
        System.out.println(unıque);

        System.out.println("------------------");

        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));
        ArrayList<Integer>unıque2=new ArrayList<>(list2);


        unıque2.removeIf(each-> Collections.frequency(list2,each)>1);

        System.out.println(unıque2);

    }



}
