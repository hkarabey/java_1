package day39.Area;

public class ShapeObjects {

    public static void main(String[] args) {
        System.out.println("------rectangle-------");

        Rectangle rectangle = new Rectangle(12, 4);
        System.out.println("rectangle.area() = " + rectangle.area());
        System.out.println("rectangle.perimeter() = " + rectangle.perimeter());

        System.out.println("-----circle---------");

        Circle circle = new Circle(12);
        System.out.println(circle);

        System.out.println("----square---------");

        Square square = new Square(11);
        System.out.println(square);
        square.setSide(10);
        System.out.println("square.Side = " + square.getSide());
        System.out.println("square' area = " + square.area());
    }


}
