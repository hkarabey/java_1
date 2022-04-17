package day41Exeptions;

public class FinallyBlock {
    public FinallyBlock() {
    }

    public static void main(String[] args) {

        int[]arr={1,2,3,4,5};

        try {
            System.out.println(arr[10]);
            System.out.println("try block");
        }catch (RuntimeException e){
            System.out.println("catch block");
            e.printStackTrace();
            //System.exit(1);
        }finally {
            System.out.println("finally block");

        }



    }

}
