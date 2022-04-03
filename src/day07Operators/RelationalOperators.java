package day07Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        //>,<,>=,<=
        boolean result1=20>=43;
        System.out.println("result1 = " + result1);

        boolean result2=200>=43;
        System.out.println("result2 = " + result2);

        boolean result3=300>=200;
        System.out.println("result3 = " + result3);

        boolean result4=100>=100;
        System.out.println("result4 = " + result4);

        boolean result5=300>=500;
        System.out.println("result5 = " + result5);

                //credit score of 720
        int score =745;
        boolean isEligibleForLoan=score>720;//true

        boolean result6=160<120;
        System.out.println("result6 = " + result6);

        boolean result7=100<=200;
        System.out.println("result7 = " + result7);

        int score1 =59;
        boolean hasFailed=score1<=59;
        System.out.println("hasFailed = " + hasFailed);

        boolean result8=45<=60;
        System.out.println("result8 = " + result8);
        System.out.println("-----------");

        int x=100;
        int y=200;
        boolean equal=x==y;
        System.out.println("equal = " + equal);

        boolean results9="halil"=="ibrahim";
        System.out.println("results9 = " + results9);

        boolean result10='A'=='a';
        System.out.println("result10 = " + result10);

        boolean asci=65=='A';
        System.out.println("asci = " + asci);

        boolean result11="java"=="java";
        System.out.println("result11 = " + result11);

        boolean result12=200!=200.0;
        System.out.println("result12 = " + result12);

        boolean result13="java"!="break";
        System.out.println("result13 = " + result13);

int w=10;
int e=15;
int t;

t=w;
w=e;
e=t;
        System.out.println("e = " + e);
        System.out.println("w = " + w);













    }


}
