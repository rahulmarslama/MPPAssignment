package Lab5.prob2;

abstract public class Duck
{
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    abstract void display();

    public void quack()
    {
        quackBehavior.quack();
    }
    public void swim()
    {
        System.out.println("Swimming");
    }
    public void fly()
    {
        flyBehavior.fly();
    }

    protected void setFlyBehavior(FlyBehavior b) {
        flyBehavior = b;
    }
    protected void setQuackBehavior(QuackBehavior q) {
        quackBehavior = q;
    }
}
