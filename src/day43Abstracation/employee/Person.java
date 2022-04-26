package day43Abstracation.employee;

import java.util.concurrent.Callable;

public  abstract class Person {

    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
       setName(name);
        setAge(age);
        this.gender = gender;
    }

    public abstract void eat();
    public abstract void sleep();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        for (int i=0;i<name.length();i++){
            if (!Character.isLetter(name.charAt(i))){
                throw new RuntimeException("name is not accesible");
        }
        }
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=18) {
            this.age = age;
        }else
            throw new RuntimeException("age is not eligible");
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
