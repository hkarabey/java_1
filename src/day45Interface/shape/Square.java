package day45Interface.shape;

public class Square extends Shape{

    public Square(String name, double side) {
        super(name);
        setSide(side);
    }


    public double area() {
        return side*side;
    }


    public double perimeter() {
        return 4*side;
    }

    private double side;

    public double getSide(){
        return side;
    }
    public void setSide(double side){
        if (side<0){
            throw new RuntimeException("invalid side");
        }
        this.side=side;
    }


    public String toString() {
        return "Square{" +
                super.toString()+
                "side=" + side +
                '}';
    }
}
