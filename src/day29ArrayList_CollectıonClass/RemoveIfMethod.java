package day29ArrayList_CollectıonClass;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
/*
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2!=0){
                list.remove(i);
            }

        }

 */
        System.out.println(list);

        list.removeIf( p-> p%2!=0);
        System.out.println(list);

        System.out.println("----------------");

        ArrayList<Integer> list2=new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf(p-> p%2==0);
        System.out.println(list2);

        System.out.println("-----------------");

        ArrayList<String> list4=new ArrayList<>();

        list4.addAll(Arrays.asList("java","java","python","c++","c#","javaScript"));

        list4.removeIf(each -> each.substring(0,1).equals("j"));
        System.out.println(list4);

        System.out.println("----------------");

        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("anna","racecar","level","eye","python","java","cydeo"));
        names.removeIf( each -> !StringUtility.palindrom((each)));
        System.out.println(names);
    }



}
