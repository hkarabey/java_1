package day31CostomClass_Constructor.Scrum;

public class Tester {

    public String name;
    public int ıdOfEmployee;
    public String jobTitle;
    public double salary;

    public Tester(String name, int ıdOfEmployee, String jobTitle, double salary) {
        this.name = name;
        this.ıdOfEmployee = ıdOfEmployee;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", ıdOfEmployee=" + ıdOfEmployee +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }
    public void createTicket(){
        System.out.println(name+" is crating");
    }
    public void dailyStandUp(){
        System.out.println(name+" is submit daily standup");
    }



}
