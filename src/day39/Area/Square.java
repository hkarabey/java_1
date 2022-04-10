package day39.Area;

import java.util.stream.StreamSupport;

public class Square extends Shape{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            System.out.println("invalid side");
            System.exit(0);
        }

        this.side = side;
    }

    public double area(){

        return side * side;
    }
    public double perimeter(){

    return  4 * side;
    }

    public Square( double side) {
        super("square");
        setSide(side);
    }


    public String toString() {
        return "Square{" +
                "side=" + side +
                ",area='" + area() + '\'' +
                ",perimeter='" + perimeter() + '\'' +
                '}';
    }
}
