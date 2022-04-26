package day43Abstracation.car;

public class CarShop {
    public static void main(String[] args) {

      // Car car=new Car(" cydeo", " sdet", " no color",2022,0);
        // we can not to create object from abstract class

     Honda honda1=new Honda("honda","accord","white",2022,2000);
     BMW bmw1=new BMW("bmw","a8","white",2022,20000);
     Tesla tesla1=new Tesla("teshalil","white",2022,30000);

        System.out.println(honda1);
        System.out.println(bmw1);
        System.out.println(tesla1);

        honda1.setColor("red");

        System.out.println("--------------------");

        System.out.println(honda1);
        honda1.start();
        honda1.stop();



    }



}
