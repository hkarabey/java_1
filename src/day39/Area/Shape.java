package day39.Area;

public class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            System.out.println("name is not true format");
        System.exit(0);
        }
        this.name = name;
    }

    public Shape(String name) {

        setName(name);
    }

    public double area() {
        System.out.println("area");
        return 0;
    }

    public double perimeter() {
        System.out.println("perimeter");
        return 0;
    }


    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ",area='" + area() + '\'' +
                ",perimeter='" + perimeter() + '\'' +
                '}';
    }
}
