package day39.CydeoTask;

public class Student extends Person {

    private int studentId;
    private String studentField;

    public int getStudentId() {
        return studentId;
    }

    public String getStudentField() {
        return studentField;
    }

    public void setStudentId(int studentId) {
        if (studentId <= 0) {
            System.out.println("invalid ıd");
            System.exit(1);
        }
        this.studentId = studentId;
    }

    public void setStudentField(String studentField) {
        if (!(studentField.equals("sdet") || studentField.equals("developer"))) {
            System.out.println("invalid fields");
            System.exit(1);
        }
        this.studentField = studentField;
    }

    public Student(String name, int age, char gender, int studentId, String studentField) {
        super(name, age, gender);
        setStudentId(studentId);
        setStudentField(studentField);
    }

    public void study() {
        System.out.println(getName() + " is studying for" + studentField);
    }

    public String toString() {
        return "Student{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentId=" + studentId +
                ", studentField=" + studentField +
                '}';
    }
}
