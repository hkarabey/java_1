package day24CustomMethodReturnMethod;

public class ReturnStatement {

    public static void main(String[] args) {
        nameOfDay(8);
    }

    public static void nameOfDay(int number) {
        if (number<1||number>7){
            System.out.println("invalid");
            return;//exist numberOfDay method
        }


        if (number==1){
            System.out.println("monday");
        }
        else if (number==2){
            System.out.println("tuesday");
        }
        else if (number==3){
            System.out.println("wednesday");
        }
        else if (number==4){
            System.out.println("thursday");
        }
        else  if (number==5){
            System.out.println("friday");
        }
        else if (number==6){
            System.out.println("saturday");
        }
        else  {
            System.out.println("sunday");
        }



    }



}
