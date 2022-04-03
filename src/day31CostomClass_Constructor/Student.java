package day31CostomClass_Constructor;

public class Student {

    public String name;
    public int age;
    public char gender;
    public char grade;
    public int ıdNumber;

    public Student(String name, int age, char gender, char grade, int ıdNumber){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.grade=grade;
        this.ıdNumber=ıdNumber;
    }



    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", ıdNumber=" + ıdNumber +
                '}';
    }
}
