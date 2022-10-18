public class Circle {
    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea()
    {
        return Math.PI*radius*radius;
    }
}
