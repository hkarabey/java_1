package day14String;

public class StringMethod2 {
    public static void main(String[] args) {
        //replace

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "johnsmith@yahoo.com";
        String newEmail = email.replace("yahoo", "qmail");

        System.out.println("email = " + email);
        System.out.println("newEmail = " + newEmail);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        sentence = sentence.replace("Python", "").replace("  ","");
        System.out.println("sentence = " + sentence);

        String s="Dog Dog Dog Dog Dog Dog";// ı want to Dog to Cat
        String newS=s.replace("Dog","Cat");
        System.out.println("s = " + s);
        System.out.println("newS = " + newS);

        String s2="C# is fun, C# is cool";
        String newS2=s2.replace(" C#"," Java");
        System.out.println("s2 = " + s2);
        System.out.println("newS2 = " + newS2);

        String s3="Java";
        s3=s3.replace("a","e");
        System.out.println("s3 = " + s3);

        //replaceFirst

        String resul1="Java Java Java";
        resul1=resul1.replaceFirst("Java","Python");
        System.out.println("resul1 = " + resul1);


    }

}
