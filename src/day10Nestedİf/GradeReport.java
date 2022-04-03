package day10Nestedİf;

public class GradeReport {
    public static void main(String[] args) {

        int number = 88;
        if (number >= 0 && number <= 100) {
            if (number >= 90) {
                System.out.println("AA");
            } else if (number >= 80 && number <= 89) {
                System.out.println("BB");
            } else if (number >= 70 && number <= 79) {
                System.out.println("CC");
            } else if (number >= 60 && number <= 69) {
                System.out.println("DD");
            } else {
                System.out.println("FF");
            }
        } else {
            System.out.println("score is not valid");
        }
        System.out.println("-----------------------");
        String result = "";


        if (number >= 0 && number <= 100) {
            if (number >= 90) {
                result = "AA";
            } else if (number >= 80 && number <= 89) {
                result = "BB";
            } else if (number >= 70 && number <= 79) {
                result = "CC";
            } else if (number >= 60 && number <= 69) {
                result = "DD";
            } else {
                result = "FF";
            }
        } else {
            result = "invalid Score";
        }

        System.out.println(result);
    }


}
