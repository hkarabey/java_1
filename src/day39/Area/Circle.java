package day39.Area;

public class Circle extends Shape {

    public int radıus;
    public static double pi;

    static {
        pi = 3.14;
    }

    public int getRadıus() {
        return radıus;
    }

    public void setRadıus(int radıus) {
        if (radıus<=0){
            System.out.println("invalid radıus");
            System.exit(0);
        }
        this.radıus = radıus;
    }


    public double area() {
        return pi * radıus * radıus;
    }

    public double perimeter() {
        return 2 * pi * radıus;
    }

    public Circle( int radıus) {
        super("circle");
        setRadıus(radıus);
    }


    public String toString() {
        return "Circle{" +
                "radıus=" + radıus +
                ",area='" + area() + '\'' +
                ",perimeter='" + perimeter() + '\'' +
                '}';
    }
}
