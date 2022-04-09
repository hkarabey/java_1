package day36Inheritance.inheritance_animal;

public class Zoo {
    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.setInfo("max","husky",'m',2,"smal","white");
        dog.eat();
        dog.drinking();
        dog.sleep();
        dog.move();
        dog.bark();
        //dog.hunting();
        System.out.println(dog);
        System.out.println("--------");

        Cat cat = new Cat();
        cat.setInfo("pamuk","british",'f',1,"middle","gray");
        cat.eat();
        cat.drinking();
        cat.move();
        cat.sleep();
        cat.meow();
        //cat.bark();
        System.out.println(cat);
        System.out.println("----------");

        Tiger tiger = new Tiger();
        tiger.setInfo("kaplan","aslan",'m',3,"big","yellow");
        tiger.eat();
        tiger.drinking();
        tiger.sleep();
        tiger.move();
        tiger.hunting();
        tiger.roar();
        //tiger.meow();
        System.out.println(tiger);
        System.out.println("--------------");
    }
}
