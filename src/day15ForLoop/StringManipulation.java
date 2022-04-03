package day15ForLoop;

import java.util.Locale;

public class StringManipulation {
    public static void main(String[] args) {

        //isEmpty()

        String str=" ";
        boolean s=str.isEmpty();
        System.out.println(s);

        //isBlank()

        boolean a=str.isBlank();
        System.out.println(a);

        String str2="cydeo   ";
        System.out.println(str2.isBlank());

        //equalsIgnoreCase()

        System.out.println("-----------");

        String s1="CYDEO";
        String s2="cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("yes".equals("YES"));
        System.out.println("yes".equalsIgnoreCase("YES"));
        System.out.println("--------------------");

        //contains()

String sentence="my favorite programmıng language is java";
        boolean hasJava=sentence.contains("java");
        System.out.println(hasJava);

        System.out.println("---------------");

        String input1="I love JAVA";
        String input2="java";

        String input11=input1.toLowerCase();
        String input21=input2.toLowerCase();


        System.out.println(input11.contains(input21));

        System.out.println("---------------");

        //starsWith

        String b="wooden spoon";
        boolean b1 = b.startsWith("woo");
        System.out.println(b1);

        //endsWith();

        boolean c=b.endsWith("on");
        System.out.println(c);

    }

}
