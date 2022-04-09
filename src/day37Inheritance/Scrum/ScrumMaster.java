package day37Inheritance.Scrum;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", ID, salary, companyName);
    }
    public void sprintBacklog(){
        System.out.println(jobTitle+" "+name+" is creating sprint backlog");
    }

}
