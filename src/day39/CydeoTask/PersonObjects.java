package day39.CydeoTask;

public class PersonObjects {

    public static void main(String[] args) {


        Student student = new Student("halil", 34, 'm', 123, "sdet");

        student.study();
        System.out.println(student);

        Tester tester=new Tester("halil",34,'m',123,"SDET",125000);
        System.out.println(tester);

    }
}
