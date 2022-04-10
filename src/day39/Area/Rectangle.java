package day39.Area;

public class Rectangle extends Shape {
    private int weight;
    private int lenght;

    public int getWeight() {
        return weight;
    }

    public int getLenght() {
        return lenght;
    }

    public void setWeight(int weight) {
        if (weight <= 0) {
            System.out.println("invalid weigth");
            System.exit(0);
        }
        this.weight = weight;
    }

    public void setLenght(int lenght) {
        if (lenght <= 0) {
            System.out.println("invalid lengtht");
            System.exit(0);
        }
        this.lenght = lenght;
    }

    public double area() {

        return weight * lenght;
    }

    public double perimeter() {
        return 2 * lenght * weight;
    }

    public Rectangle( int weight, int lenght) {
        super("rectangle");
        setWeight(weight);
        setLenght(lenght);
    }


    public String toString() {
        return "Rectangle{" +
                "weight=" + weight +
                ",lenght=" + lenght +
                ",area='" + area() + '\'' +
                ",perimeter='" + perimeter() + '\'' +
                '}';
    }
}
