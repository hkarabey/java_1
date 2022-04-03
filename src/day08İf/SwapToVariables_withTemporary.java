package day08İf;

public class SwapToVariables_withTemporary {

    public static void main(String[] args) {

        int a=10;
        int b=15;

        System.out.println("a = " + a+"\n"+"b = " + b);

        System.out.println("after swap");
        int c=b;//15
        b=a;//b=10
        a=c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }





}
