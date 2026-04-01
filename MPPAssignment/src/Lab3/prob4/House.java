package Lab3.prob4;

public class House extends Property
{
    private double lotSize;

    public House(double lotSize) {
        this.lotSize = lotSize;
    }


    @Override
    double calculateRent() {
        return 0.1*lotSize;
    }
}
