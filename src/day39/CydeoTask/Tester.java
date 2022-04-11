package day39.CydeoTask;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, int employeeID,  double salary) {
        super(name, age, gender, employeeID, "sdet", salary);
    }


    public void work() {
        System.out.println(getName() + " is working as a tester");
    }

    public void createTıcket() {
        System.out.println(getName() + " is creating ticket");
    }


}
