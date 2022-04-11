package day39.CydeoTask;

public class Teacher extends Employee{

    public Teacher( String name, int age, char gender, int employeeID, double salary) {
        super(name, age, gender, employeeID, "teacher", salary);
    }


    public void work() {
        System.out.println(getName()+" is working as a teacher");
    }


}
