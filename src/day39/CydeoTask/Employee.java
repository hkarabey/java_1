package day39.CydeoTask;

public class Employee extends Person {

    private int employeeID;
    private String jobTıtle;
    private double salary;

    public void setEmployeeID(int employeeID) {
        if (employeeID <= 0) {
            System.out.println("invalid Id");
            System.exit(1);
        }
        this.employeeID = employeeID;
    }

    public void setJobTıtle(String jobTıtle) {
        if (!(jobTıtle.equals("sdet")||jobTıtle.equals("developer")||jobTıtle.equals("teacher"))) {
            System.out.println("invalid jobtitle");
            System.exit(1);
        }
        this.jobTıtle = jobTıtle;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            System.out.println("invalid salary");
            System.exit(1);
        }
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getJobTıtle() {
        return jobTıtle;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, int age, char gender, int employeeID, String jobTıtle, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setJobTıtle(jobTıtle);
        setSalary(salary);
    }

    public void work() {
        System.out.println(getName() + " is working");
    }


    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", employeeID=" + employeeID +
                ", jobTıtle=" + jobTıtle +
                ", salary=" + salary +
                '}';
    }
}
