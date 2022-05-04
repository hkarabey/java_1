package day45Interface.shape;

public class Circle extends Shape {

    public Circle(String name, double radius) {
        super(name);
       setRadius(radius);
    }



    public final static double pi=3.14;

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<0){
            throw new RuntimeException("invalid radius");
        }
        this.radius = radius;
    }


    public double area() {
        return pi*radius*radius;
    }

    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString() +
                "radius=" + radius +
                '}';
    }
}
