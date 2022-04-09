package day37Inheritance.Animal;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog("max", 'm', 1, "big", "white");
        System.out.println(dog1);
        dog1.barkin();

        Cat cat1 = new Cat("alex", 'm', 2, "smal", "gray", true);
        System.out.println(cat1);
        cat1.scratch();

        Parrot parrot1=new Parrot("cici",'f',1,"middle","blue","yellow");
        System.out.println(parrot1);
        parrot1.singing();


    }


}
