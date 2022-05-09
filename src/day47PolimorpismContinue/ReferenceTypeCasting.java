package day47PolimorpismContinue;

import day43Abstracation.employee.Developer;
import day43Abstracation.employee.Employee;
import day43Abstracation.employee.Tester;
import day44Interface.AbstractContinue.Animal;
import day44Interface.AbstractContinue.Dog;
import day45Interface.shape.Circle;
import day45Interface.shape.Cube;
import day45Interface.shape.Shape;
import day45Interface.shape.Square;

import java.util.concurrent.Callable;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        Circle circle = new Circle("circle", 4);
        Shape shape = (Shape) circle;//upcasting
        Circle circle1 = new Circle("circle", 5);
        Shape shape1 = circle1;//upcasting

        Animal animal=new Dog("max1","hasky",'m',2,"middle","white");//upcasting


        Dog dog= (Dog) animal;//it is downCasting

        System.out.println(animal.getName());

        System.out.println(dog.getName());

        dog.bark();

       //
        ((Dog) animal).bark();


        Shape shape2=new Square("Square",4);

        System.out.println(((Square) shape2).getSide());

        Employee employee= new Tester("ali",34,'m',12,"sdet",12000);

        Tester employee1= (Tester) employee;
        employee1.bugreport();

        Employee employee2= new Developer("ali",34,'m',12,"sdet",12000);

        ((Developer)employee2).fixReport();

        Shape s1=new Circle("circle",10);

        s1.perimeter();
        s1.area();
      // ((Cube) s1).volume(); //circle is no relationship with cube it is not true way to casting


    }


}
