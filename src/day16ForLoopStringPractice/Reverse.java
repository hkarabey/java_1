package day16ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {
        String word="wooden spoon";
        String result="";

        for (int i = word.length()-1; i >=0 ; i--) {
            result+=word.charAt(i);
        }


        System.out.println(result);



    }


}
