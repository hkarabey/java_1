package day20Array;

public class MinAndMaxNumberAtTheSameTime {

    public static void main(String[] args) {

        int[]numbers={1,32,65,78,0,-98};
int min=numbers[0];
int max=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max<numbers[i]){
                max=numbers[i];
            }
            if (min>numbers[i]){
                min=numbers[i];
            }

        }
        System.out.println(min);
        System.out.println(max);

    }

}
