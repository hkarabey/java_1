package day17WhileLoop;

public class EvenContinue {
    public static void main(String[] args) {
        for (int i = 0; i <=10 ; i++) {
            if (i%2==1){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("------------");
        for (int i = 0; i <=10 ; i++) {
            if (i%2==0){
                continue;
            }
            System.out.print(i+" ");
        }

    }




}
