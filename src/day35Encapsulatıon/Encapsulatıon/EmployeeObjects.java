package day35Encapsulatıon.Encapsulatıon;

import java.util.Arrays;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1=new Employee("ahmet",'w',-21,200);
        employee1.setName("halil");

        System.out.println(employee1);
        Employee employee2=new Employee("nihan",'f',31,1300);
        System.out.println(employee2);

        Employee[]employees={employee1,employee2};
        System.out.println(Arrays.toString(employees));


    }

}
