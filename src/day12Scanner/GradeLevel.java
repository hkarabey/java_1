package day12Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        byte gradeLevel=12;
        switch (gradeLevel){
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("elementary");
                break;
            case 6: case 7:
                System.out.println("middle");
                break;
            case 8: case 9:
                System.out.println("hıgh school");
                break;
            default:
                System.out.println("invalid");
                break;
        }


    }

}
