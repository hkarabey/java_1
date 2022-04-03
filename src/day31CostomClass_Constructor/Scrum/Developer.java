package day31CostomClass_Constructor.Scrum;

public class Developer {

    public String name;
    public int ıdOfEmployee;
    public String jobTitle;
    public double salary;


    public Developer(String name, int ıdOfEmployee, String jobTitle, double salary) {
        this.name = name;
        this.ıdOfEmployee = ıdOfEmployee;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", ıdOfEmployee=" + ıdOfEmployee +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name+" is coding");
    }
    public void unitTesting(){
        System.out.println(name+" is unit test");
    }
    public void fixingBug(){
        System.out.println(name+" is fixing Bug");
    }



}
