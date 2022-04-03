package day33CustomClass_Static;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student obj1=new Student("ahmet");
        System.out.println(obj1);

        Student obj2=new Student("aygun",'f');

        Student obj3= new Student("nigarra",11);

        Student obj4=new Student("kevin",12,'m');

        Student obj5= new Student("halil",'m',12);

        Student obj6=new Student("halil",'m',12,12);

        System.out.println(obj6);


        Student[]students={obj1,obj2,obj3,obj4,obj5,obj6};
        System.out.println(Arrays.toString(students));

    }

}
