package day39.CydeoTask;

public class PersonObjects {

    public static void main(String[] args) {


        Developer developer=new Developer("ceylin",32,'f',15,124000);

        Student student = new Student("halil", 34, 'm', 123, "sdet");

        student.study();
        System.out.println(student);

        Tester tester=new Tester("halil",34,'m',123,125000);
        System.out.println(tester);

        Teacher teacher=new Teacher("muhtar",32,'m',16,130000);

        System.out.println();
        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(developer);

        developer.setAge(21);
        System.out.println("developer.getAge() = " + developer.getAge());

        System.out.println("----------");
        student.study();
        System.out.println("-----------");
        developer.drink();
        developer.sleep();
        developer.eat();
        System.out.println("---------");
        tester.eat();
        tester.sleep();
        tester.work();

    }
}
