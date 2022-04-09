package day37Inheritance.Animal;

import day37Inheritance.Animal.Animal;

public class Dog extends Animal {


    public Dog(String name, char gender, int age, String size, String color){
        super(name, gender, age, size, color);

    }
    public void barkin(){
        System.out.println(name + " is barking");
    }
}

