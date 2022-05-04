package day45Interface.shape;

public class Cylindir extends Shape implements Volume{

    public Cylindir(String name) {
        super(name);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}
