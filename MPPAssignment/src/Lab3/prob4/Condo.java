package Lab3.prob4;

public class Condo extends Property
{
    private int numFloors;

    public Condo(int numFloors) {
        this.numFloors = numFloors;
    }

    @Override
    double calculateRent() {
        return 400*numFloors;
    }
}
