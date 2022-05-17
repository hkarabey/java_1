package day49Collection;

import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.Array;
import java.util.*;

public class SetPractice {
    public static void main(String[] args) {

        String[]arr={"Wooden Spoon","Book","Pen","Phone","Wooden Spoon",
    "Wooden Spoon","Wooden Spoon","Wooden Spoon","Milk","Eggs","Coke","Paper towels"};

        Set<String>setArr=new HashSet<>();
        setArr.addAll(Arrays.asList(arr));
        System.out.println(setArr);

        arr=setArr.toArray(new String[0]);

        System.out.println(Arrays.toString(arr));


        System.out.println("--------------------");

        ArrayList<Integer>list=new ArrayList<>();

        list.addAll(   Arrays.asList(10,20,20,20,3,389,390,34,76));

        Set<Integer>linkedHashSet=new LinkedHashSet<>();
        list=new ArrayList<>( new LinkedHashSet<>(list) );
        System.out.println(list);

        System.out.println("--------------");

        String[] array={"A","B","C","D"};

        Set<String>linkedHashSet1=new LinkedHashSet<>();
        linkedHashSet1.addAll(Arrays.asList(array));
        System.out.println("----------------------");




        Integer[]nums={1,1,1,2,2,3,4,4,5,5,5,6,7,7,8,9,9,9};

       nums= new LinkedHashSet<Integer>(Arrays.asList(nums)).toArray( new Integer[0]);

        System.out.println(Arrays.toString(nums));

        System.out.println("-*-------------");

        String str="aaabbbbeeeedddff";

        String result="";//a3b4e4d3f2;

        Set<String>linkedHashSet3=new LinkedHashSet<String>(Arrays.asList(str.split("")));
        for (String each : linkedHashSet3) {
          int count=  Collections.frequency(Arrays.asList(str.split("")),each);

          result+=each+count;
        }

        System.out.println(result);
        System.out.println("---------------------");

        Set<String> names=new HashSet<>();
        names.addAll(Arrays.asList("AHMET","AHMET","AHMET","JAMES","JOHN","ALEXANDRA","CARLA","AHMET"));

        System.out.println("names.toArray(new String[0])[2] = " + names.toArray(new String[0])[2]);

    }


}
