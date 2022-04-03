package day11Swich;

public class ConverNumberToWordTernaries {
    public static void main(String[] args) {
        int n=9;


      String result= (n>=0&&n<=9)?(n==0)?"zero":(n==1)?"one":(n==2)?"two":(n==3)?"three":(n==4)?"four"
                :(n==5)?"five":(n==6)?"six":(n==7)?"seven":(n==8)?"eight":"nine":"invalid";

        System.out.println(result);
        }



    }



