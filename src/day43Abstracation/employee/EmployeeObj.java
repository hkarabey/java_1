package day43Abstracation.employee;

public class EmployeeObj {
    public static void main(String[] args) {

        Tester tester1=new Tester("halil",34,'m',11,"sdet",120000);
        //Person person1=new Person("josh",23,'m');
        //abstract class can not be created
        System.out.println(tester1);
        tester1.work();
        tester1.eat();
        tester1.sleep();


    }



}
