package day34GarbageColectıon_AccesModifier;

import day30CustomClasses.Dog;
import day32CustomClass_Cunstructor.Car;
import day33CustomClass_Static.Iphone;
import day33CustomClass_Static.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class GarbageCollectıon {


    public static void main(String[] args) {

        String  str="wooden spoon";
        //str=null;
        System.out.println(str.substring(0));

        Car car1=new Car("toyota");

        car1=null;

        System.out.println(car1);

        System.out.println("---------");

        Dog dog1=new Dog();
        dog1.name="lucy";

        dog1=new Dog();
        dog1.name="max";
        //lucy is eligible for garbage collectıon
        System.out.println(dog1);
        System.out.println("-------");

        String language="python";
        language="java";
        System.out.println(language);
        //python is eligible for garbage collectıon

        System.out.println("----------");

        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(122);

        ArrayList<Integer>list2=list1;

        list2.addAll(Arrays.asList(200,300));

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1==list2);//it is not eligible because they are not unreferenced

        System.out.println("--------------");

        Student student1=new Student("tahir",'m',12,1212);
        student1.studentId=1221;
        Student student2=student1;
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("----------");

        ArrayList<String>l1=new ArrayList<>();
        l1.add("java");

        ArrayList<String>l2=l1;
        l2.add("python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

    }
    
}
