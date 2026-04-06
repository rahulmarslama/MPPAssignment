package Lab5.prob2;

public class RedHeadDuck extends Duck{
    public RedHeadDuck()
    {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    void display() {
        System.out.println("Displaying ReadHead Duck");
    }
}
