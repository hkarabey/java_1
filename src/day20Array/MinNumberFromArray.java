package day20Array;

public class MinNumberFromArray {
    public static void main(String[] args) {
    int[] numbers={1,2,3,0,4,6,2,12};
int min=numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (min>numbers[i]){
                min=numbers[i];
            }

        }
        System.out.println(min);

    }



}
