package day37Inheritance.Phone;

import day37Inheritance.Phone.Phone;

public class Samsung extends Phone {

    public Samsung(String brand, String model, String size, double price, String color){
        super("Samsung", model, size, price, color);
    }
public void freeze(){
    System.out.println(brand+" "+model+" is freezing");
}
}
