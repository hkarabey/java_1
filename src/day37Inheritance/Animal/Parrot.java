package day37Inheritance.Animal;

import day37Inheritance.Animal.Animal;

public class Parrot extends Animal {

    public String parrotWıngColor;

    public Parrot(String name, char gender, int age, String size, String color, String parrotWıngColor) {
        super(name, gender, age, size, color);
        this.parrotWıngColor = parrotWıngColor;
    }

    public void singing() {
        System.out.println(name + " is singing");
    }
}
