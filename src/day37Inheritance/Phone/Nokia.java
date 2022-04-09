package day37Inheritance.Phone;

public class Nokia extends Phone {

    public Nokia(String brand, String model, String size, double price, String color){
        super("Nokia", model, size, price, color);
    }

    public void selfDefence(){
        System.out.println(brand+" "+model+" has self defence");
    }


}
