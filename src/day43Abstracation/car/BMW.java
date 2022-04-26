package day43Abstracation.car;

public class BMW extends Car {

    public BMW(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    public void start(){
        System.out.println("say to start");
    }
}


