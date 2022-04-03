package day36Inheritance;

public class Student {

    private String name;
    private int age;
    private char gender;
    private String grade;
    private String schoolName;
    public static boolean isStudent=true;
    public static boolean isHuman=true;


    public String  getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String  getGrade() {
        return grade;
    }

    public String  getSchoolName() {
        return schoolName;
    }

    public void setName(String name) {


        this.name = name;

    }

    public void setAge(int age) {
        if (age<5||age>90){
            return;
        }
        this.age = age;

    }

    public void setGender(char gender) {
        if (!(gender=='m'||gender=='f')){
            return;
        }
        this.gender = gender;

    }

    public void setGrade(String grade) {
        if (!(grade.equals("A")||grade.equals("B")||grade.equals("C")||grade.equals("A"))){
            return;
        }

        this.grade = grade;

    }

    public void setSchool(String SchoolName) {
        this.schoolName = schoolName;

    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public Student(String name, int age, char gender, String grade,String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchool(schoolName);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade='" + grade + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';

    }


}
