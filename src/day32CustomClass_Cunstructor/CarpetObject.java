package day32CustomClass_Cunstructor;

import day30CustomClasses.Car;

public class CarpetObject {

    public static void main(String[] args) {

        Carpet carpet1=new Carpet(3,4,100,false);

        System.out.println("carpet1 = " + carpet1);

        Carpet carpet2=new Carpet(3,4,100,true);

        System.out.println("carpet2 = " + carpet2);
    }
}
