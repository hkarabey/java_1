package day10Nestedİf;

public class Nestedİfİntro {
    public static void main(String[] args) {

        int score = 59;
        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }

        } else {
            System.out.println("give a valid score");
        }
    }


}
