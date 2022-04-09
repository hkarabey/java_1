package day38İnheretance.Car;

public class BMW extends Car{

    public BMW( String model, int year, double price, String color, int miles) {
        super("bmw", model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand+ model+" is breakdown");
    }
    public void racing(){
        System.out.println(brand+model+" is racing");
    }

}
