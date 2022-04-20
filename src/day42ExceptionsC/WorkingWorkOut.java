package day42ExceptionsC;

public class WorkingWorkOut {

    public static void main(String[] args) {

        System.out.println("-----------pushup Started-----------");

        for (int i = 1; i <= 30; i++) {


            System.out.print("\rpushup "+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//

        }
        System.out.println(" push up completed");

        System.out.println("-------pull up started---------");

        for (int i = 1; i <=30 ; i++) {
            System.out.print("\r pull up "+i);

                sleep(1);


        }
        System.out.println(" pull up completed");
    }

    public static void sleep(double seconds) {


        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
