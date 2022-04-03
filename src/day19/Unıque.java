package day19;

public class Unıque {
    public static void main(String[] args) {
        String str = "aaabbbdsdq1";//sq1
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c1 = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char c2 = str.charAt(j);

                if (c1 == c2) {
                    count++;
                }
            }

            if (count == 1) {
                result += c1;
            }
        }

        System.out.println(result);

    }


}
