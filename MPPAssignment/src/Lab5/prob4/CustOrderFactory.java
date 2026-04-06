package Lab5.prob4;

import java.time.LocalDate;

final public class CustOrderFactory
{
    private CustOrderFactory() {}

    public static Order newOrder(Customer cust, LocalDate date)
    {
        if(cust == null) throw new NullPointerException("Null customer");

        Order ord = new Order(date);
        cust.addOrder(ord);
        return ord;
    }
}
