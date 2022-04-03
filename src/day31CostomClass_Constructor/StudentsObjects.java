package day31CostomClass_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsObjects {
    public static void main(String[] args) {

        Student student1=new Student("halil",34,'m','a',1238);
        Student student2=new Student("nihal",29,'f','a',1289);

        ArrayList<Student>students=new ArrayList<>(Arrays.asList(student1,student2));

        System.out.println(students);

        System.out.println(student1);
        System.out.println(student2);



    }


}
