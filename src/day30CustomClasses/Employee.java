package day30CustomClasses;

public class Employee {
    public String name;
    public int ıd;
    public char gender;
    public int age;
    public String jobTıtles;
    public double salary;
    public boolean isFullTıme;

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ıd=" + ıd +
                ", gender=" + gender +
                ", jobTıtles='" + jobTıtles + '\'' +
                ", salary= $" + salary +
                ", isFullTıme=" + isFullTıme +
                '}';
    }

    public void setInfo(String name, int ıd, char gender,int age, String jobTıtles, double salary, boolean isFullTıme) {
        this.name = name;
        this.ıd = ıd;
        this.gender = gender;
        this.jobTıtles = jobTıtles;
        this.salary = salary;
        this.isFullTıme = isFullTıme;
    }

    public void work() {
        System.out.println(name + " " + " is working");
    }

}
