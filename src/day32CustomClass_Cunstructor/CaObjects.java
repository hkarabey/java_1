package day32CustomClass_Cunstructor;

import java.util.concurrent.Callable;

public class CaObjects {
    public static void main(String[] args) {

        Car car1 = new Car("toyota");
        Car car2 = new Car("toyota", "corolla");
        Car car3 = new Car("toyota", "corolla", 2022);
        Car car4 = new Car("toyota", "corolla", 2022, 50000);
        Car car5 = new Car("toyota", "corolla", 2022, 50000, "white");

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);
        System.out.println("car4 = " + car4);
        System.out.println("car5 = " + car5);

    }

}
