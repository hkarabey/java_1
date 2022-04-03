package day17WhileLoop;

public class WordFrequency {
    public static void main(String[] args) {
        String word="java";
        String wordInclude="java";
        int frequency=0;
        for (int i = 0; i <= word.length()-4; i++) {

               if(word.substring(i,i+4).equalsIgnoreCase(wordInclude)){
                   frequency++;
               }

        }
        System.out.println(frequency);


    }


}
