package day52Map;

public class FubctionalInterfaceTest {

    public static void main(String[] args) {

        MyFunctionalInterface oddOrEvenNumber = (anyName) -> {
            if (anyName % 2 == 0) {
                System.out.println(anyName + " is even");
            } else {
                System.out.println(anyName + " is odd");
            }
        };

        oddOrEvenNumber.apply(20);


        System.out.println("-----------");

        MyFunctionalInterface eligibleToBuyAlcohol = (age) -> {

            if (age >= 18) {
                System.out.println(age + " is eligible to buy alcohol");
            } else {
                System.out.println(age + " is NOT eligible to buy alcohol");
            }
        };

        eligibleToBuyAlcohol.apply(19);

        System.out.println("------------------");

        MyFunctionalInterface printCube = (number) -> {
            System.out.println(number + " 's cube is " + number * number * number);
        };

        printCube.apply(10);

        System.out.println("--------------");

        MyFunctionalInterface divisibleBy3AND5= (n)->{
            if (n%15==0){
                System.out.println(n+" is divided by 15");
            }else {
                System.out.println(n+" İSNOT divided by 15");
            }
        };
        divisibleBy3AND5.apply(15);
    }



}
