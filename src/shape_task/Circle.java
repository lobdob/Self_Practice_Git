package shape_task;

public class Circle extends Shape {
    private double radius;


    public Circle(String name, double radius) {
        super(name);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius * radius * 3.14;


    }

    @Override
    public double perimeter() {

        return 2 * (radius * 3.14);


    }

    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", radius='" + radius + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}