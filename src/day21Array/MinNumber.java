package day21Array;

public class MinNumber {
    public static void main(String[] args) {
        int numbers[]={10,2,33,44,54};
        int min=numbers[0];

        for (int each : numbers) {
            if (each<min){
                min=each;
            }

        }
        System.out.println(min);



    }

}
