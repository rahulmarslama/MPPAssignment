package Lab2.prob2b;

import java.util.ArrayList;
import java.util.List;

public class Order
{
    public List<OrderLine> orderLineList;

    public Order()
    {
        orderLineList = new ArrayList<OrderLine>();
        addOrderLine();
    }

    public void addOrderLine()
    {
        orderLineList.add(new OrderLine(this));
    }


}
