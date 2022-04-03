package day14String;

public class StringMethod3 {
    public static void main(String[] args) {

        //substring(beginning index, ending index)

        String word = "cydeo school";

        String brand = word.substring(0, 5);
        System.out.println("brand = " + brand);
        String word1 = word.substring(6, 12);
        String word2 = word.substring(6);
        System.out.println("word1 = " + word1);
        System.out.println("word2 = " + word2);

        String word3 = "Java Programıng Language";
        String s1 = word3.substring(0,word3.indexOf(" "));
        String s2 = word3.substring(5, word3.lastIndexOf(" "));
        String s3 = word3.substring(word3.lastIndexOf(" ")+1);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);


    }


}
