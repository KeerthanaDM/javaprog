public class Cylinder extends Circle{
    double height;
    String color;

    public Cylinder(double radius, double height,String color) {
        super(radius,color);
        this.height = height;
        this.color=color;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getArea()
    {
       return 2*Math.PI*radius*(radius+height);
    }

    public double getVolume()
    {
        return super.getArea()*this.height;
    }
}
