package day30CustomClasses;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("halil", 12, 'M', 34, "Qa", 1500, true);
        employee2.setInfo("emine", 13, 'F', 34, "Qa", 1300, false);
        employee3.setInfo("alexsandr", 14, 'F', 32, "DEV", 1600, true);
        employee4.setInfo("NAZIM", 15, 'M', 34, "Qa", 1900, true);
        employee5.setInfo("hsinem", 16, 'F', 39, "BA", 1200, false);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        int count = 0;
        for (Employee employee : employees) {
            if (employee.isFullTıme == true) {
                count++;
            }
        }
        System.out.println(count + " employes are ful time working");

        double minSalary = employee1.salary;
        for (Employee employee : employees) {
            if (employee.salary < minSalary) {
                minSalary = employee.salary;
            }
        }
        System.out.println(minSalary);
    }


}
