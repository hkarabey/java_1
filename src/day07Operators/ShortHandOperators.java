package day07Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int num = 100;
        System.out.println("num = " + num);//100
        num = 200;
        System.out.println("num = " + num);//200

        String word = "Java Proggaming";

        System.out.println("word = " + word);
        word = "wooden spoon";
        System.out.println("word = " + word);
        System.out.println("will learn \"Java\" and \"SQL\" at Cybertek");
        String topic1 = "\"java\"";
        String ttopic2 = "\"SQL\"";
        System.out.println(topic1);
        System.out.println("I will learn " + topic1 + " and " + ttopic2 + " at CybertekSchool.");

        System.out.println("----------");
        //addidtional assignment

        int x = 100;
        System.out.println("x = " + x);
        System.out.println(x + 200);
        System.out.println("x = " + x);
        x += 200;
        System.out.println("x = " + x);
        String str = "wooden";
        str += "spoon";
        System.out.println("str = " + str);
        double num1 = 2.5;
        System.out.println("num1 = " + num1);
        num1 += 5.5;
        System.out.println("num1 = " + num1);
        System.out.println("----------");
         //witdrawing 595$
        double avaliableBalance = 1000.5;
        avaliableBalance += 500;
        System.out.println("avaliableBalance = " + avaliableBalance);
        avaliableBalance -= 300;
        System.out.println("avaliableBalance = " + avaliableBalance);
        System.out.println("---------");
        double salary = 5000;
        salary *= 2;
        System.out.println("salary = " + salary);
        double dodge = 0.00002;
        dodge *= 2111;
        System.out.println("dodge = " + dodge);

        System.out.println("---------");

        double num2=2500;
        num2/=2;
        System.out.println(num2);

        System.out.println("--------");

        double num3=100;
        num3%=3;
        System.out.println("num3 = " + num3);

        System.out.println("---------");

        int amount=127;

        int quarters=127/25;
        int cent=127%25;
        System.out.println("quarters = " + quarters);
        System.out.println("cent = " + cent);
        int cents2=127;
        cents2%=25;
        System.out.println("cents2 = " + cents2);

        System.out.println("----------");
        int y=300;
        y%=16;
        System.out.println("y = " + y);

        System.out.println("-------");

        int balance=3500;
        //insurance fee:$153
        balance%=153;
        System.out.println("balance = " + balance);






    }


}
