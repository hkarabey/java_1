package day28ArrayList;

public class StrongPassword2 {

    public static void main(String[] args) {

        String str="qwe234sd/AA";

        char[]chars=str.toCharArray();

        int countUpper=0;
        int countLower=0;
        int countDigit=0;
        int countSpeci=0;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])){
                countUpper++;
            }
            else if (Character.isLowerCase(chars[i])){
                countLower++;
            }else if(Character.isDigit(chars[i])){
                countDigit++;
            }else {
                countSpeci++;
            }

        }
        if(str.length()>=8&&!str.contains(" ")&&(!(countDigit==0&&countSpeci==0&&countLower==0&&countUpper==0))){
            System.out.println("it is strong password");
        }else {
            System.out.println("not strong password");
        }
    }



}
