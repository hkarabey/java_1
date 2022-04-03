package day08İf;

public class NumberOfMonthDays {

    public static void main(String[] args) {
        int number = 5;//1~12
        boolean has28Days = number == 2;
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;
        boolean has31Days = !has28Days && !has30Days;
/*
number==1||number==3||number==5||number==7
||number==8||number==10||number==12;
*/

        /*

        1-3-5-7-8-10-12 -> 31 days
        4-6-9-11 --------> 30 days
        2----------------> 28 days
         */
        if (has28Days) {

            System.out.println("28 days");
        }
        if (has30Days) {
            System.out.println("30 days");
        }
        if (has31Days) {
            System.out.println("31 days");
        }


    }
}
