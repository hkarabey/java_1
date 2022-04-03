package day12Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("give a number between 1 to 7");
        int number=scan.nextInt();
String result ="";
if(number>=1&&number<=7){
   result= (number==1)?"monday":(number==2)?"tuesday":(number==3)?"wednesday"
            :(number==4)?"thursday":(number==5)?"friday"
            :(number==6)?"saturday":"sunday";



}else{
    result="invalid number";
}
        System.out.println(result);
scan.close();
    }


}
