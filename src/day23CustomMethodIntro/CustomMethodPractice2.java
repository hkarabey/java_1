package day23CustomMethodIntro;

public class CustomMethodPractice2 {
    public static void main(String[] args) {
       helloWord5Times();
      helloCydeo5Times();
      evenNumbers();
    }

    //create a functıon that print hello words 5 times
    //create a functıon that hello cydeo 5 times
    //write even number from 1 to 100

    public static void helloWord5Times() {
for (int i=1;i<=5;i++){
    System.out.println("hello word");
}

    }

    public static void helloCydeo5Times() {
for (int i=1;i<=5;i++){
    System.out.println("hello Cydeo");
}

    }

    public static void evenNumbers(){

        for (int i = 1; i <=100 ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }
    }

}
