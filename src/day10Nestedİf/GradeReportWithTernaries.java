package day10Nestedİf;

public class GradeReportWithTernaries {
    public static void main(String[] args) {

        int number = 59;
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
        System.out.println("------------");
       String k=(number>=0&&number<=100)? (number>=90)? "AA":(number>=80&&number<=89)?"BB"
                :(number>=70&&number<=79)?"CC":(number>=60&&number<=69)?"DD":"FF":"give a valid number";
        System.out.println(k);
    }


}
