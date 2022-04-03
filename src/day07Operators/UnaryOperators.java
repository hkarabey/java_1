package day07Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1=+25;
        int num2=-25;
        System.out.println(num1<0);//false
        System.out.println(num2<0);//true

        int a=25;
        System.out.println(++a);
        System.out.println(--a);
        int b=5;
        ++b;//pre increment:increses the value by1 rıght away
        System.out.println(b);
        --b;//pre decrement: decreses the value by1 rıght away
        System.out.println("-----------------");
        int c=100;
        int d=100;
        System.out.println(++c);//pre increment 101
        System.out.println(d++);//post increment 100
        System.out.println(d+"  "+c);

        int x=200;
        System.out.println(--x);//pre ıncrement: 199

        int y=200;
        System.out.println(y--);//post increment: 200
        System.out.println("--------");
        int z=45;
        System.out.println(++z);//pre:46
        System.out.println(z++);//post:46 z=47
        System.out.println(z);//47
        System.out.println("--------------");
        int r=30;
        System.out.println(--r);//pre dec:r=29
        System.out.println(r--);//post dec:r29 new r=28
        System.out.println(r);// 28
    }


}
