package day52Map;

public class MySecondFunctionalInterfaceTest {

    public static void main(String[] args) {


        MySecondFunctÄ±onalInterFace<String>printEach=(s) -> {

            for (String each : s.split("")) {
                System.out.println(each);
            }
        };

        printEach.test("wooden spoon");

    }

}
