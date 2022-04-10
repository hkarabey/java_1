package day39.Free;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.concurrent.Callable;

public class PhoneTask {

    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;


    public void setInfo(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public void call(long phoneNumber) {
        System.out.println("phone number is calling" + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println("phone number is texting " + phoneNumber);
    }


    public String toString() {
        return "PhoneTask{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        if (brand == null) {
            System.out.println("invalid brand");
            System.exit(0);
        }
        for (int i = 0; i < brand.length(); i++) {

            if (Character.isDigit(brand.charAt(i))) {
                System.out.println("your brand name can not has digit");
                System.exit(0);
            }
        }
        this.brand = brand;
    }

    public void setModel(String model) {
        if (model == null) {
            System.out.println("invalid model");
            System.exit(0);
        }
        this.model = model;
    }

    public void setSize(String size) {
        if (size == null) {
            System.out.println("invalid size");
            System.exit(0);

        }
        this.size = size;
    }

    public void setPrice(double price) {
        if (price == 0.0) {
            System.out.println("invalid price");
            System.exit(0);
        }
        this.price = price;
    }

    public void setColor(String color) {
        if (color.equals(null)) {
            System.out.println("invalid color");
            System.exit(0);
        }
        this.color = color;
    }
}
