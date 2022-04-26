package day43Abstracation.employee;

public abstract class Employee extends Person{


    public final int Id;
    public String jobTitle;
    public double salary;

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        Id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public abstract void work();


    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                ",age=" + getAge() +
                ",gender=" + getGender() +
                ",Id=" + Id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
