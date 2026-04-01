package Lab2.prob2b;

import java.util.ArrayList;
import java.util.List;

public class Order
{
    public List<OrderLine> orderLineList;
    public String orderName;
    public Order(String orderName,int quantity)
    {
        this.orderName = orderName;
        orderLineList = new ArrayList<OrderLine>();
        addOrderLine(quantity);
    }

    public void addOrderLine(int quantity)
    {
        orderLineList.add(new OrderLine(this,quantity));
    }


}
