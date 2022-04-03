package day13String;

import java.lang.String;

public class Stringİnfo {
    public static void main(String[] args) {
        String name="wooden spoon";//same object
        String name2="wooden spoon";
        String name3="wooden spoon";
        String name4="wooden spoon";
        String name5="wooden spoon";
        String name6="wooden spoon";
        System.out.println(name==name3);

        System.out.println("----------");

        String str1=new String("wooden spoon");//differnt object
        String str2=new String("wooden spoon");
        System.out.println(str1==str2);

        System.out.println("-------------");

        String s1="java";
        String s2=new String("java");
        String s3=new String("java");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));


    }

}
