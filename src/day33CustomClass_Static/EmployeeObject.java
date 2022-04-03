package day33CustomClass_Static;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1=new Employee();
        employee1.name="ahmet";
        employee1.salary=10000;

        Employee employee2=new Employee();
        employee2.name="mehmet";
        employee2.salary=5000;

        System.out.println(employee1.name);
        System.out.println(employee2.name);

        System.out.println(employee1.salary);
        System.out.println(employee2.salary);

        System.out.println(employee1.isHuman);
        System.out.println(employee2.isHuman);


    }

}
