package day08İf;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int number=65;
        boolean divisible_by_2 =number%2==0;
        boolean divisible_by_3=number%3==0;
        boolean divisible_by_5=number%5==0;
        System.out.println(number+ " is divisible by 2: "+divisible_by_2);
        System.out.println(number+ " is divisible by 3: "+divisible_by_3);
        System.out.println(number+ " is divisible by 5: "+divisible_by_5);



    }


}
