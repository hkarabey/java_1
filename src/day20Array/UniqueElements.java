package day20Array;

public class UniqueElements {

    public static void main(String[] args) {

        String []words={"java","java","c#","python","python"};

        for (int j = 0; j <words.length ; j++) {


            String elements = words[j];
            int frequency = 0;

            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(elements)) {
                    frequency++;
                }

            }
            if (frequency==1){
                System.out.println(elements);
            }
        }

    }



}
