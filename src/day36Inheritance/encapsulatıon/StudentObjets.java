package day36Inheritance.encapsulatıon;

import java.util.Arrays;

public class StudentObjets {
    public static void main(String[] args) {

        Student student1=new Student("halil",4,'m',"A","cydeo");
        Student student2=new Student("yeşim",32,'f',"A","cydeo");

        student2.setAge(33);

        System.out.println(student1);
        System.out.println(student2);
Student[]students={student1,student2};

        System.out.println(Arrays.toString(students));
    }


}
