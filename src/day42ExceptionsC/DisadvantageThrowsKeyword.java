package day42ExceptionsC;

public class DisadvantageThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("hello");
       sleep(1.5);

        System.out.println("hello word");
        WorkingWorkOut.sleep(1.5);  // try & catch

    }


    public static void sleep(double seconds) throws InterruptedException {
        Thread.sleep( (long)(seconds*1000));
    }




}
