package day29ArrayList_CollectıonClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractıcee1 {
    //create an Array of string country name
    //if length of country name  greater than 10 that can remove
    public static void main(String[] args) {


        String[] countrıes = {"japan", "korea", "united states", "turkey", "united kıngdom"};


        ArrayList<String>list=new ArrayList<>(Arrays.asList(countrıes));

      list.removeIf(each-> each.length()>=10);
        System.out.println(list);

        //convert array list to array

        countrıes=list.toArray(new String[0]);
        System.out.println(Arrays.toString(countrıes));
    }
}
