package day23CustomMethodIntro;

public class CustomIntro {
    public static void greeting() {//main metod is absent and we have to write main method
        System.out.println("hello everybody");
        System.out.println("how are you today");

    }

    public static void main(String[] args) {//it must be inside the class and where is not important

        System.out.println("Test");
        greeting();//call the greeting method
        System.out.println("test completed");

    }
}
