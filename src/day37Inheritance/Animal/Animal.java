package day37Inheritance.Animal;

public class Animal {

 public String name;
 public char gender;
 public int age;
 public String size;
 public String color;

 public void isEating(){
     System.out.println(name+" is eating");
 }
 public void isDrink(){
     System.out.println(name+" is drinking");
 }
 public void move(){
     System.out.println(name+" is moving");
 }
 public void sleep(){
     System.out.println(name+" is sleeping");
 }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Animal(String name, char gender, int age, String size, String color) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }
}
