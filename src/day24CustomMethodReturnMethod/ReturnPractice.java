package day24CustomMethodReturnMethod;

public class ReturnPractice{
    public static void main(String[] args) {

        //find the max number between 100-200
        //multıply the max number by 2

        int maxnumber=maxNumber(100,200);
        System.out.println(maxnumber);
        System.out.println(maxnumber*2);

    }

    public static int maxNumber(int number1,int number2){
        int result=0;
      if (number1>number2){
          result=number1;
      }else {
          result=number2;
      }
      return result;
    }



}
