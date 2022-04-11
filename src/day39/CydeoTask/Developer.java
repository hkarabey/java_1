package day39.CydeoTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int employeeID, double salary) {
        super(name, age, gender, employeeID, "developer", salary);
    }


    public void work() {
        System.out.println(getName()+ " is working as a developer");
    }

   public void fixingBgs(){
       System.out.println(getName()+" is fixing bugs");
   }

}
