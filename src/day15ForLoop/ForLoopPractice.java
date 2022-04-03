package day15ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {
        for(int i=15;i<=45;i++){
            System.out.print(i+" ");

            }
        System.out.println();
        //100~~~50
        for (int i=100;i>=50;i--){
            System.out.print(i+" ");
        }
        //all even numbers between 1~~~55
        System.out.println();
        for(int i =1; i<=55;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }

        }


    }


}
