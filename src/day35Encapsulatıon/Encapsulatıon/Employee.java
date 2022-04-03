package day35Encapsulatıon.Encapsulatıon;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name.equals("")) {
            System.err.println("invalid name ");
            return;
        }
        this.name = name;
    }

    public void setGender(char gender) {
        if ((gender != 'f' || gender != 'm' || gender != 'F' || gender != 'M')) {
            System.out.println("invalid gender :" + gender);
            return;
        }
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age > 70 || age < 18) {
            System.err.println("invalid age : " + age);
            return;
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.err.println("invalid salary: " + salary);
            return;
        }
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }
}
