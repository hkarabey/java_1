package day37Inheritance.Phone;

public class IPhone extends Phone {



    public IPhone(String brand, String model, String size, double price, String color){
        super("Apple", model, size, price, color);
    }

    public void faceTime(long phoneNumber) {
        System.out.println(brand + " " + model + " has facetime with " + phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand+" "+model+" has facetime with "+email);
    }


}
