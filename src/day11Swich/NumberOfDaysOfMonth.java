package day11Swich;

public class NumberOfDaysOfMonth {
    public static void main(String[] args) {
        /*
        28 days:2
        30 days:4,6,9,11
        31 days:1,3,5,7,8,10,12
         */
        int month = 2;
        int year=2000;
        if (month >= 1 && month <= 12) {
            switch (month) {
                case 2:
                    System.out.println((year%4==0)?"month has 29 days":"month has 28 days");
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.println("month has 30 days");
                    break;
                default:
                    System.out.println("month has 31 days");
                    break;
            }
        }else {
            System.out.println("invalid number");
        }

        System.out.println("------------");
        if (month >= 1 && month <= 12) {
            if (month == 2) {
                System.out.println("month has 28 days");
            } else if (month == 2 || month == 6 || month == 9 || month == 11) {
                System.out.println("month has 30 days");
            } else {
                System.out.println("month has 31 days");
            }

        } else {
            System.out.println("invalid");
        }
        System.out.println("------------");
        switch (month){
            case 2:
                System.out.println("month has 28 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("month has 30 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("month has 31 days");
                break;
            default:
                System.out.println("invalid number");
                break;
        }
    }

}
