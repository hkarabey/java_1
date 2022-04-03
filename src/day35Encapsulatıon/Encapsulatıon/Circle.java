package day35Encapsulatıon.Encapsulatıon;

public class Circle {

    private double radius;
    public static double pi;

    static {
        pi=3.14;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadıus(double radius){
        if (radius<=0){
            System.out.println("invalid radius");
            return;
        }
        this.radius=radius;
    }

    public double area(){
        return pi*radius*radius;
    }
    public double perimeter(){
        return 2*pi*radius;
    }

    public Circle(double radius) {
        setRadıus(radius);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
