package day31CostomClass_Constructor;

public class RectangleObjects {
    public static void main(String[] args) {


        Rectangle rectangle1 = new Rectangle(12, 10);

        Rectangle rectangle2=new Rectangle(24,10);

        System.out.println(rectangle1);
        System.out.println(rectangle2);

        System.out.println("rectangle1.area() = " + rectangle1.area());
        System.out.println("rectangle1.perimeter() = " + rectangle1.perimeter());

        System.out.println("rectangle2.area() = " + rectangle2.area());
        System.out.println("rectangle2.perimeter() = " + rectangle2.perimeter());



    }

}
