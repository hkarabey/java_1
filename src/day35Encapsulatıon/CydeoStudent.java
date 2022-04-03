package day35Encapsulatıon;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public String fieldOfStudy;

    public static String schoolName;
    public static String programmıngLanguage;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName="cydeo";
        programmıngLanguage="java";
    }

    public static void printSchoolName(){
        System.out.println("school name is: "+schoolName);
    }

    public void attendingClass(){
        System.out.println("class name is: "+batchNumber);
    }

    public void study(){
        System.out.println(name+" is stduying "+fieldOfStudy);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
