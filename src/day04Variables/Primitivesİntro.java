package day04Variables;

public class Primitivesİntro {
    public static void main(String[] args) {

        //age :38 years old

        //DataType Variablename=Data;
        byte age = 38;
        System.out.println(age);

        //weght:160 pound
        //byte weıght= 160; 160 is out of byte range
        short weight = 160;
        System.out.println(weight);

        //salary 100000$
        //short salary=100000; out of short value
        int salary = 100000;
        System.out.println(salary);

        //asset 3333333333;
        //int asset =3333333333;out of int value
        // we must add l en of number for long
        long asset= 3_333_333_333l;
        System.out.println(asset);

        // tax 0,23
        // float tax=0.23f
        float tax=0.23f;
        System.out.println(tax);

        //tax 0.23
        //double we dont add any karacter end of number
       double tax2=0.23;
        System.out.println(tax2);

    //ascii table
        char ch1='#';
        System.out.println("ch1 = " + ch1);
        char ch2=35;
        System.out.println("ch2 = " + ch2);

        char ch3=65_535;
        System.out.println("ch3 = " + ch3);

        boolean isEmployed=true;
        boolean isMarried=false;
        boolean result=100>300;
        System.out.println("result = " + result);

        String country="usa";
        System.out.println("country = " + country);

        //String is sequences of charcters
        //String is also class therefor S is big
        //ascii is alphabet of computer language
    }


}
