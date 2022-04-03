package day16ForLoopStringPractice;

public class DigitsLettersSpecialcChars {
    public static void main(String[] args) {
        String str="123CydeoSchollWoodenSpoon<>£# ½{[";
            String digits="";
            String letters="";
            String specialCh="";

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);

            if (ch>='0'&&ch<='9'){
                digits+=ch;

            }else if (ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
                letters+=ch;
            }else {
                if (ch!=' '){
                specialCh+=ch;}
            }

        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialCh = " + specialCh);
    }

}
