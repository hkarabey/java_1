package day39.CydeoTask;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int employeeID, String jobTıtle, double salary) {
        super(name, age, gender, employeeID, jobTıtle, salary);
    }


    public void work() {
        System.out.println(getName()+" is working as a teacher");
    }


}
