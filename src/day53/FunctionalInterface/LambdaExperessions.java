package day53.FunctionalInterface;

import day53.FunctionalInterface.ThirdFunctionalInterface;

public class LambdaExperessions {

    public static void main(String[] args) {

        ThirdFunctionalInterface<String> stringReverse=(s)->{
            String reverse= new StringBuilder(s).reverse().toString();
            return reverse;
        };

        String result=stringReverse.method("wooden spoon");
        System.out.println(result);


    }
}
