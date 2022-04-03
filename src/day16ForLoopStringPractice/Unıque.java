package day16ForLoopStringPractice;

public class Unıque {
    public static void main(String[] args) {

        String str = "aaaadbbbc";

        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result += ch;

            }


        }
        System.out.println(result);
    }

}
