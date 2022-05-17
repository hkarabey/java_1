package day50Collection;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {

        Set<Integer>hasSet=new HashSet<>();
        hasSet.addAll(Arrays.asList(10,20,30,40,20,90,70,60));

        Integer[]array=hasSet.toArray( new Integer[0] );
        System.out.println(Arrays.toString(array));

        List<Integer>arraylist=new ArrayList<>( hasSet );

        System.out.println("-------------------");
        //poll

        LinkedList<String>names=new LinkedList<>();

        names.addAll(Arrays.asList("james","jimmy","catty","alexandra"));

        ((LinkedList<String>)names).poll();
        System.out.println(names);



    }




}
