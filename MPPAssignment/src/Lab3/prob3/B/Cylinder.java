package Lab3.prob3.B;

public class Cylinder
{
    private double height;
    public Circle circle;


    public Cylinder(double height, double radius, Circle circle) {
        this.height = height;
        this.circle = new Circle(radius);
    }

    public double getHeight() {
        return height;
    }

    public double computeVolume()
    {
        return this.height * circle.computeArea();
    }
}
