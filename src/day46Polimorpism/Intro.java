package day46Polimorpism;

import day39.Area.Circle;
import day43Abstracation.employee.Employee;
import day43Abstracation.employee.Tester;
import day44Interface.AbstractContinue.Animal;
import day44Interface.AbstractContinue.Dog;
import day45Interface.shape.*;

public class Intro {
    public static void main(String[] args) {

        String str="wooden spoon";
        Integer n1=2;
        Double n2=4.4;
        Boolean r1=true;

        /*
        String[]array={str,n1,n2,r1};

        int[]arr={1,2};
         */

        Object []array={str,n1,n2,r1,new Circle(4),new Square("circle",11)};

        Employee employee= new Tester("halil",34,'m',11,"sdet",120000);

        employee.work();

        //employee.bugreport();


        //instanceof

        Shape shape=new Rectangle("rectangle");

        boolean isSquare= shape instanceof Square;
        boolean isRectangle= shape instanceof Rectangle;
        boolean isTriangle= shape instanceof Triangle;
        boolean isCube= shape instanceof Cube;
        boolean isCylindir= shape instanceof Cylindir;

        if (isSquare==true){
            System.out.println("it is square");
        }else{
            System.out.println("it is not square");
        }
        if (isRectangle==true){
            System.out.println("it is rectangle");
        }else{
            System.out.println("it is not rectangle");
        }
        if (isTriangle==true){
            System.out.println("it is triangle");
        }else{
            System.out.println("it is not triangle");
        }
        if (isCube==true){
            System.out.println("it is cube");
        }else{
            System.out.println("it is not cube");
        }
        if (isCylindir==true){
            System.out.println("it is cylindir");
        }else{
            System.out.println("it is not cylindir");
        }


    }


}
