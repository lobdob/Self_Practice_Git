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
        double area = radius * radius * 3.14;

        System.out.println("Area of circle is " + area);
    }

    @Override
    public double perimeter() {

        double perimeter = 2 * (radius * 3.14);
        System.out.println("Perimeter of the circle is " +);

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