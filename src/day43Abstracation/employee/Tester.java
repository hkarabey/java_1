package day43Abstracation.employee;

public final class Tester extends Employee {

    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void work() {
        System.out.println(getName() + " is working as a Tester");
    }


    public void eat() {
        System.out.println(getName() + " is eating");

    }

    public void sleep() {
        System.out.println(getName() + " is sleeping");

    }
    public void bugreport(){
        System.out.println(getName()+" is reporting bug");
    }

    public String toString() {
        return "Tester{" +
                "name=" + getName() +
                ",age=" + getAge() +
                ",gender=" + getGender() +
                ",Id=" + Id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }


}
