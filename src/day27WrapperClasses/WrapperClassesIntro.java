package day27WrapperClasses;

public class WrapperClassesIntro {
    public static void main(String[] args) {

        int num1=200;

       // Long n1=num1; Long is wrapper class of long primitives

        Integer n1=num1; // Autoboxing

        int num2=n1; // unboxing
        System.out.println("--------------");

        Integer integerValue=100;
        long longValue=integerValue;

        Byte b1=25;
        byte b2=b1;
        short s1=b1;
        int i1=b1;
        System.out.println("-----------");

        int num3=200;
       // Long l2=num3;
        Integer num4=num3;
        System.out.println("--------------");

        int[]numbers={1,2,3,4,5};
        Integer[]numbers2={1,2,3,4,5};


    }



}
