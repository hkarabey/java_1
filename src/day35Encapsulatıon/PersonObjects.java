package day35Encapsulatıon;

public class PersonObjects {
    public static void main(String[] args) {


        Person person1 = new Person("halil", 33, 'm', "java");

        System.out.println(""+person1.name+Person.isHuman+""+person1.gender+""+Person.planet);
        System.out.println(person1.gender);


    }
}
