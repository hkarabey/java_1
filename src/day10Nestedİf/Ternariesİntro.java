package day10Nestedİf;

public class Ternariesİntro {
    public static void main(String[] args) {
        int n = 100;
        if (n % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
        System.out.println("-----------");
        String result1 = (n % 2 == 0) ? "even" : "odd";
        System.out.println(result1);
        System.out.println("----------------");


        int age = 23;
        if (age >= 21) {
            System.out.println("eligible to buy alcohol");
        } else {
            System.out.println("not eligible to buy alcohol");
        }
        System.out.println("------------");
        System.out.println((age >= 21) ? "eligible to buy" : "not eligible");
        System.out.println("----------------");

        int nu=100;
        if (nu>0){
            System.out.println("positive");
        }else if (nu<0){
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }
        System.out.println("-----------");

       String a= (nu>0)?"positive" :(nu<0)?"negative" :"zero";
        System.out.println(a);



    }


}
