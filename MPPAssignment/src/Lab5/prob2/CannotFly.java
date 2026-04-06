package Lab5.prob2;

public class CannotFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Can not fly");
    }
}
