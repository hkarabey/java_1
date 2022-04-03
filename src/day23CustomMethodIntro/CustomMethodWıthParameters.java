package day23CustomMethodIntro;

public class CustomMethodWıthParameters {
    //create a functıon that can check wheater number is odd or even

    public static void main(String[] args) {
        oddOrEven(6);
        ageOfPerson(1985);
        between(10,20);
    }

    public static void oddOrEven(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

    }

    public static void ageOfPerson(int birthYear) {
        int age = 2022 - birthYear;
        System.out.println("perso of age is " + age);

    }
//create a functıon that all numbers between XandY

    public static void between(int x,int y ){
        for (int i = x; i <= y; i++) {
            System.out.print(i+" ");
        }

    }

}


