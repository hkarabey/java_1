package day37Inheritance.Scrum;

public class BusinessAnalist extends Employee{
    public BusinessAnalist(String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender, "Business Analyst", ID, salary, companyName);
    }
    public void speak(){
        System.out.println(jobTitle+" "+name+" is speaking with client");
    }
}
