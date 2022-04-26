package day43Abstracation.employee;

public final class Developer extends Employee {

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void work() {
        System.out.println(getName() + " is working as a developer");
    }

    public void eat() {
        System.out.println(getName() + " is eating");
    }

    public void sleep() {
        System.out.println(getName() + " is sleeping");
    }

    public void fixReport() {
        System.out.println(getName() + " is fixing bug");
    }

    public String toString() {
        return "Tester{" +
                "name=" + getName() +
                ",age=" + getAge() +
                ",gender=" + getGender() +
                ",Id=" + Id +
                ", jobTitle='" + jobTitle +
                '\'' +
                ", salary=" + salary + '}';
    }
}