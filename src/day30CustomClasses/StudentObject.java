package day30CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {


    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setInfo("sinem", 'F', 29, 1232, 'A');

        Student student2 = new Student();

        student2.setInfo("halil", 'M', 35, 1234, 'A');

        Student student3 = new Student();

        student3.setInfo("AYLİN", 'F', 30, 1235, 'B');

        Student student4 = new Student();

        student4.setInfo("hulya", 'F', 28, 1236, 'B');

        Student student5 = new Student();

        student5.setInfo("elminur", 'F', 30, 1237, 'A');

        Student[] students = {student1, student2, student3, student4, student5};

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>();//gradeA

        for (Student student : students) {
            if (student.grade == 'A') {
                earlyBirds.add(student);

            }
        }
        System.out.println(earlyBirds);

        ArrayList<Student> angryBirds = new ArrayList<>();
        angryBirds.addAll(Arrays.asList(students));
        angryBirds.removeIf(p -> p.grade == 'A');
        System.out.println(angryBirds);


    }
}
