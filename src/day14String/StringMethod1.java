package day14String;

public class StringMethod1 {

    public static void main(String[] args) {

        //trim

        String str1 = "   batch     eu8    ";
        str1.trim();
        System.out.println(str1);
        str1 = str1.trim();
        System.out.println(str1);
        System.out.println("---------");

        //index

        String str2 = "cydeo School";
        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);
        int n2 = str2.indexOf('c');
        System.out.println("n2 = " + n2);
        String str3 = "java programing school";
        int n = str3.indexOf("a");
        System.out.println("n = " + n);
        int n3 = str3.indexOf("a ");
        System.out.println("n3 = " + n3);
        int n4 = str3.indexOf("am");
        System.out.println("n4 = " + n4);

        //last IndexOf()

        int n5 = str3.lastIndexOf("g");
        System.out.println("n5 = " + n5);
        System.out.println("------------------- ");

        String s1 = "Java Nova Java Wava orange";

        int firstA = s1.indexOf("a");
        int lastA = s1.lastIndexOf("a");
        int secondA=s1.indexOf("a ");
        int thirdA=s1.indexOf("a J");
//
        int fourthA=s1.indexOf("Java W")+1;

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);

    }

}
