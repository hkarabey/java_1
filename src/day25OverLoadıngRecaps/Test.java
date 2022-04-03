package day25OverLoadıngRecaps;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str = "java programmıng Language";
        StringUtility.printEachChar(str);
        String a=StringUtility.reverse(str);
        System.out.println(a);

        boolean a1=StringUtility.palindrom("anna");
        System.out.println(a1);

        String[] names={"anna","java","mom","cydeo","racecar"};

        int a2=StringUtility.howManyPalindrom(names);
        System.out.println(a2);

        boolean a3=StringUtility.anagram("listen","lisetn");
        System.out.println(a3);

        String a4=StringUtility.duplicatedWitout("aaaabbbsssddd");
        System.out.println(a4);
    }


}
