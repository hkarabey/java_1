package day38İnheretance.Car;

public class Tesla extends Car{

    public Tesla( String model, int year, double price, String color, int miles) {
        super("tesla", model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand+model+" has auto pilot");
    }

}
