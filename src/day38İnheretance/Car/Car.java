package day38─░nheretance.Car;

public class Car {

    public String brand;
    public String model;
    public int year;
    public double price;
    public String color;
    public int miles;

     void start(){
        System.out.println(brand+" "+model+" is started");
    }
    public void drive(){
        System.out.println(brand+model+ "is driven");
    }

    public Car(String brand, String model, int year, double price, String color, int miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }


}
