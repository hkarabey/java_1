package day41Exeptions;

public class TryCatchBlocks {
    public static void main(String[] args) {
        System.out.println("test started");
        try {
            System.out.println(9/0);
            System.out.println("try block");
        }catch (ArithmeticException e){

            System.out.println("catch block");
            System.out.println("arithmetic exception was occurred");
        }

        System.out.println("test completed");


        System.out.println("test 2 started");

        int[]numbers={1,2,3,4,5};
        try {
            System.out.println(numbers[100]);
            System.out.println("try block");
        }catch (RuntimeException e){
            System.out.println("catch block");
        }

        System.out.println("test 2 was completed");


    }



}
