package day10Nestedİf;

public class EligibleForBuyingAlkohol {
    public static void main(String[] args) {
        int age=25;
        boolean hasId=true;
        if (!hasId) {
            if (age >= 21) {
                System.out.println("Eligible For Buying Alcohol");
            } else {
                System.out.println("Not Eligible To Buy Alcohol");
            }
        }else{
            System.out.println("you do not has ıd");
        }

        System.out.println("--------------");

        int number=2;
        if (number>=1&&number<=7){
            if(number==1){
                System.out.println("monday");
            }
            else if (number==2){
                System.out.println("tuesday");
            }
            else if (number==2){
                System.out.println("wednesday");
            }
            else if (number==4){
                System.out.println("thursday");
            }
            else if (number==5){
                System.out.println("friday");
            }else if (number==6){
                System.out.println("saturday");

            }else {
                System.out.println("sunday");
            }


        }else{
            System.out.println("number is not valid");
        }


    }


}
