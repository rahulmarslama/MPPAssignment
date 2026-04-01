package Lab3.prob3.A;

public class Circle extends Cylinder
{
    private double radius;
    public Circle(double radius, double height) {
        super(radius, height);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea()
    {
        return Math.PI*Math.pow(this.radius,2);
    }
}
