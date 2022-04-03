package day20Array;

import java.util.Arrays;

public class Arrayİntro {
    public static void main(String[] args) {
        //create a variable thats capable enough contain 5 names

String myGroup[]=new String[5];

myGroup[0]="gunay";
myGroup[1]="nil";
myGroup[2]="suat";
myGroup[3]="mikael";
myGroup[4]="neira";



        //System.out.println(myGroup); it is given to us hashcode

        System.out.println(Arrays.toString(myGroup));

        System.out.println("---------------");

        String[]days={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        System.out.println(Arrays.toString(days));

        int number=5;
        if (number<1||number>7){
            System.out.println("invalid number");
            System.exit(0);

        }
        System.out.println(days[number-1]);
    }

}
