package day38İnheretance.Car;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota=new Toyota("corolla",2022,145000,"white",0);

        Tesla tesla=new Tesla("Model s",2022,94999,"red",0);

        BMW bmw=new BMW("x5",2022,250000,"white",0);

        System.out.println(tesla);
        System.out.println(toyota);
        System.out.println(bmw);
        System.out.println("------------------");
        toyota.start();
        bmw.start();
        tesla.start();

    }
}
