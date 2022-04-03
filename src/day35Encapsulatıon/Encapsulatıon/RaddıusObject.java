package day35Encapsulatıon.Encapsulatıon;

import javax.swing.plaf.metal.MetalIconFactory;

public class RaddıusObject {
    public static void main(String[] args) {

        Circle circle1=new Circle(-4);
        Circle circle2=new Circle(10);

        System.out.println(circle1.area());
        System.out.println(circle2.area());

        System.out.println(circle1.perimeter());
        System.out.println(circle2.perimeter());


    }



}
