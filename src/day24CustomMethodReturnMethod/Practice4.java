package day24CustomMethodReturnMethod;

public class Practice4 {
    public static void main(String[] args) {
        //fınd unıqe character from the string
        String str = "aabccdee";

        for (int i = 0; i <= str.length() - 1; i++) {

            int count = freq(str, str.charAt(i));

            if (count == 1) {
                System.out.println(str.charAt(i) + " is unıqe");
            }
        }

    }

    public static int freq(String str, char ch) {

        int coun = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                coun++;
            }
        }

        return coun;
    }

}
