package day44Interface.AbstractContinue;

public final class Dog extends Animal implements Playable, WildAnimal{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){
        System.out.println(getName()+" eats dog meal");
    }
    public void bark(){
        System.out.println(getName()+" barks");
    }
    public void play(){

    }


    @Override
    public void hunt() {

    }
}
