package day36Inheritance;

public class Student {

    private String name;
    private int age;
    private char gender;
    private String grade;
    private String schoolName;


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

    public Student(String name, int age, char gender, String grade) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
    }
}
