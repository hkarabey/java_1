package day35Encapsulatıon;

public class SundaySectıon {

public String name;
public char gender;
public int age;
public int ID;
public char grade;


    public SundaySectıon(String name) {
        this.name = name;
    }

    public SundaySectıon(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public SundaySectıon(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public SundaySectıon(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public String toString() {
        return "SundaySectıon{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

public static void study(String name){
    System.out.println(name+" is studying");
}



}
