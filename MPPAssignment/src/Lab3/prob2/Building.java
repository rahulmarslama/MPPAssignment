package Lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building
{
    public List<Apartment> apartments = new ArrayList<>();
    public double maintenanceCost;
    private double profit;

    public Building(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public double getProfit() {
        return profit;
    }

    public void addApartment(Apartment apartment)
    {
        apartments.add(apartment);
        profit += apartment.getRent();
    }

}
