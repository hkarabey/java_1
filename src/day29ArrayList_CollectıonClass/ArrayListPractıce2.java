package day29ArrayList_CollectıonClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractıce2 {

    public static void main(String[] args) {

        ArrayList<String>employees=new ArrayList<>();
        employees.addAll(Arrays.asList("ahmet","davud","jımmy","danıel","aoron","ahmet","davud","shay"));

        employees.retainAll( Arrays.asList("ahmet","davud"));
        System.out.println(employees);

        System.out.println("-------------------");

        String[]names={"mary", "monıca","mehray","musti","sumeyra","beril","hasan"};

        ArrayList<String>removeM=new ArrayList<>(Arrays.asList(names));

        removeM.removeIf(each->each.startsWith("m"));

        names=removeM.toArray(new String[0]);
        System.out.println(Arrays.toString(names));
    }



}
