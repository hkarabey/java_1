package day21Array;

public class MaxNumber {
    public static void main(String[] args) {

        int[]numbers={10,5,20,12,1,0};
        int max=numbers[0];
        for (int each:numbers){
           if (each>max){
               max=each;
           }
        }
        System.out.println(max);

    }

}
