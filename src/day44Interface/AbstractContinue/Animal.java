package day44Interface.AbstractContinue;

public abstract class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;

    public final static boolean canBreath;

    static {
        canBreath=true;
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        this.breed = breed;
        if (!(gender=='m'||gender=='f'||gender=='M'||gender=='F')){
            throw new RuntimeException("invalid gender");
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }
    public void drink(){
        System.out.println(getName()+" drinks water");
    }

    public abstract void eat();




    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age<0){
            throw new RuntimeException("invalid age");
        }
        this.age = age;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", canBreath='" + canBreath + '\'' +
                '}';
    }
}
