package day30CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjet {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println(car1);

        car1.setInfo("audı", "A8", "white", 2022, 500);
        System.out.println(car1);

        car1.drive();

        Car car2 = new Car();

        car2.brand = "bmw";
        car2.model = "İ9";
        car2.color = "white";
        car2.year = 2023;
        car2.price = 200000;
        System.out.println(car2);
        car2.start();

        System.out.println("-----------------");

        ArrayList<Car> carlist = new ArrayList<>();
        carlist.addAll(Arrays.asList(car1, car2));

        System.out.println(carlist);

        for (Car each : carlist) {
            System.out.println(each.brand + " " + each.price);
        }

        carlist.removeIf(p -> p.brand.equals("bmw"));
        System.out.println(carlist);
    }
}