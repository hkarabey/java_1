package day17WhileLoop;

import java.util.Locale;

public class FrequencyOfWordWithWhile {
    public static void main(String[] args) {
        String str="java java java pythonjava";
        int frequency=0;

        while (str.contains("java")){
            str=str.replaceFirst("java","");
            frequency++;
        }
        System.out.println(frequency);
        System.out.println("-------------------------");

        String sentence="cat CAT cat cat cat cat dog dog dog cat ";
        sentence=sentence.toLowerCase();

        int countCat=0;

while(sentence.contains("cat")){
    sentence=sentence.replaceFirst("cat","");
    countCat++;
}
        System.out.println(countCat);
    }



}
