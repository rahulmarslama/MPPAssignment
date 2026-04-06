package Lab5.prob3;

public class Main
{
    static void main() {
        Rectangle rec = new Rectangle(2.5,5.6);
        Circle cir = new Circle(4.5);
        Triangle tri = new Triangle(1.2,8.6);


        Shape[] shapes = new Shape[]{rec,cir,tri};

        double sumOfAreas = 0;
        for(Shape s : shapes)
        {
            sumOfAreas += s.computeArea();
        }

        System.out.printf("The sum of areas is: %.2f",sumOfAreas);
    }
}
