package day41Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {
    public static void main(String[] args) {
        System.out.println("test started");
        try {
            System.out.println(9/0);
            System.out.println("try block");
        }catch (ArithmeticException e){

            System.out.println("catch block");
            System.out.println("arithmetic exception was occurred");
        }

        System.out.println("test completed");

        System.out.println("------------------------");

        System.out.println("test 2 started");

        int[]numbers={1,2,3,4,5};
        try {
            System.out.println(numbers[100]);
            System.out.println("try block");
        }catch (RuntimeException e){
            System.out.println("catch block");

            //System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("test 2 was completed");

        System.out.println("---------------------------");

        System.out.println("test3 started");



        try {
            System.out.println("cydeo".substring(2,0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("test3 was completed");
        System.out.println("-----------------");

        System.out.println("test4 is started");


        try {
            Thread.sleep(300);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("cydeo");


        String str="123";
        int a=Integer.parseInt(str);
        System.out.println(a);
        Integer c=Integer.valueOf(str);

        System.out.println(c);
        int s=123;
        String str1=String.valueOf(s);
        System.out.println(str1);

        System.out.println("---------------");
try{
    FileInputStream file=new FileInputStream("file path");
}catch (FileNotFoundException e){
    e.printStackTrace();
}

    }



}
