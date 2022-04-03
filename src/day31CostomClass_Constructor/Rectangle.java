package day31CostomClass_Constructor;

public class Rectangle {

    public double lenght;
    public double width;

    public Rectangle(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }

    public double area(){
        double area=lenght*width;
        return area;
    }

    public double perimeter(){
        double perimeter=2*(lenght+width);
        return perimeter;
    }

    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                ",area=" + lenght*width+
                ",perimeter="+2*(lenght+width)+
                '}';
    }
}
