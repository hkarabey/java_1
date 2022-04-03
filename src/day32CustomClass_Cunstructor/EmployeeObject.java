package day32CustomClass_Cunstructor;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1=new Employee("halil");
        System.out.println("employee1 = "+employee1);

        Employee employee2=new Employee("halil",'m');
        System.out.println("employee2 = " + employee2);

        Employee employee3= new Employee("halil",'m',"sdet");
        System.out.println("employee3 = " + employee3);

        Employee employee4=new Employee("halil",'m',"sdet",100);
        System.out.println("employee4 = " + employee4);


    }

}
