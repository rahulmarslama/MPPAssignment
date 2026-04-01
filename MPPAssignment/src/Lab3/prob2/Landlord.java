package Lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord
{
    public List<Building> buildings = new ArrayList<>();


    public Landlord() {
    }

    public void addBuilding(Building building)
    {
        buildings.add(building);
    }

    public double calculateProfit()
    {
        double totalProfit=0;
        for (Building b:buildings)
        {
            totalProfit += b.getProfit();
        }
        return totalProfit;
    }
}
