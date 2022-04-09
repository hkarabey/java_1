package day37Inheritance.Scrum;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender, "Product Owner", ID, salary, companyName);
    }

    public void productBacklog(){
        System.out.println(jobTitle+" "+name+" is creating product backlog");
    }
}
