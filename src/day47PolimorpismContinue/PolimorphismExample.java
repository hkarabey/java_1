package day47PolimorpismContinue;

import day37Inheritance.Animal.Animal;
import day37Inheritance.Animal.Dog;
import day38İnheretance.Car.BMW;
import day38İnheretance.Car.Car;
import day38İnheretance.Car.Tesla;
import day38İnheretance.Car.Toyota;
import day43Abstracation.car.Honda;

public class PolimorphismExample {
    public static void main(String[] args) {


        Car[] car = {new Toyota("honda1", 2018, 12000, "white", 0),
                new Toyota("honda2", 2019, 12000, "white", 1),
                new Toyota("honda3", 2016, 12000, "white", 2),
                new Toyota("honda4", 2011, 12000, "white", 3),
                new BMW("a4", 2013, 21000, "red", 4),
                new BMW("a5", 2019, 21000, "red", 11),
                new BMW("a6", 2017, 21000, "red", 5),
                new BMW("a9", 2013, 21000, "red", 6),
                new Tesla("halil1tesla", 2022, 12000, "dark", 7),
                new Tesla("halil2tesla", 2021, 12000, "dark", 8),
                new Tesla("halil3tesla", 2020, 12000, "dark", 9),
                new Tesla("halil4tesla", 2019, 12000, "dark", 10)};

        for (Car each : car) {

            if(each instanceof Toyota){
                if (each.year>2015){
                    System.out.println(each);
                }
            }
            if (each instanceof Tesla){
                if (each.year>2021){
                    System.out.println(each);
                }
            }
            if (each instanceof BMW){
                if (each.year>2018){
                    System.out.println(each);
                }
            }
        }
    Car carWithHigestMiles= car[0];

        for (int i = 0; i < car.length; i++) {

            if (carWithHigestMiles.miles<car[i].miles){
                carWithHigestMiles=car[i];

            }
        }
        System.out.println("----------");
        System.out.println(carWithHigestMiles);
    }
    
}
