package day42ExceptionsC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantagesOfKeyword2 {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        method1();
        method2();

        String s1=null;
        try {
            System.out.println(s1.toLowerCase());
        }catch (Exception e){
            e.printStackTrace();
        }
    }



    public static void method1() throws FileNotFoundException {

     // new FileInputStream("");
    }

    public static void method2() throws FileNotFoundException, InterruptedException {

        method1();
        Thread.sleep(1000);
    }

    public static void method3() throws Exception /*it is not recomended*/{
        method2();
    }
}
