package day35Encapsulatıon;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;


    public static String planet;
    public static boolean isHuman;
    public static boolean hasNose;
    public static int numberOfWings;
    public static int numberOfHead;


    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age=age;
        this.gender = gender;
        this.language = language;

    }

    static {
        planet="word";
        isHuman=true;
        hasNose=true;
        numberOfWings=0;
        numberOfHead=1;
}

public static void printPlanetName(){
    System.out.println("planet name is: "+planet);

}

public static void printİsHuman(){
    System.out.println("is human: "+isHuman);
}

public void eat(String food){
    System.out.println(name+" is aeting "+food);

}

public void drink(String drink){
    System.out.println(name+" is drinking "+drink);
}


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                '}';
    }
}
