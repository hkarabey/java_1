package day21Array;

public class UnıqueElements {
    public static void main(String[] args) {
        String[] words = {"java", "java", "c#", "python", "python"};

        for (String elements : words) {


            int count = 0;

            for (String each : words) {
                if (each.equals(elements)) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(elements);
            }
        }


    }
}
