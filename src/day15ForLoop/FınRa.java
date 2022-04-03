package day15ForLoop;

public class FınRa {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%15==0){
                System.out.print("fınra ");
            }else if (i%3==0){
                System.out.print("fın ");
            }else if (i%5==0){
                System.out.print("ra ");
            }else{
                System.out.print(i+" ");
            }

        }




    }


}
