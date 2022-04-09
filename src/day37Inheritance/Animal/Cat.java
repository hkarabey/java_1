package day37Inheritance.Animal;

public class Cat extends Animal {
public boolean mıow;
    public Cat(String name, char gender, int age, String size, String color, boolean mıow){
        super(name, gender, age, size, color);

        this.mıow=mıow;

    }
public void scratch(){
    System.out.println(name+" is scratching");
}

}
