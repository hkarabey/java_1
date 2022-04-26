package day43Abstracation.car;

public final class Tesla extends Car{

    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    public void start(){
        System.out.println("touch the car "+getMake()+"  for starting");

    }
    public static void fliyng(){
        System.out.println("meybe");
    }
}
