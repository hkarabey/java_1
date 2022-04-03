package day19;

public class Frequency {
    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "";//a2
        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if (ch == ch2) {
                    frequency += 1;


                }


            }
if (result.contains(""+ch)){
    continue;
}
            result += ch;
            result += frequency;
        }

        System.out.println(result);

    }


}
