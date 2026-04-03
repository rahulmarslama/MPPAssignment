package Lab4.prob2;

import java.util.ArrayList;
import java.util.List;

public class CommissionEmployee extends Employee{

    private double baseSalary;
    private double commission = 0;
    public List<Order> orders = new ArrayList<>();

    public CommissionEmployee(int empId, double baseSalary, List<Order> orders) {
        super(empId);
        this.baseSalary = baseSalary;
        this.orders = orders;
    }


    @Override
    public double calcGrossPay(int month,int year){

        for(Order order:orders)
        {
            if(order.getOrderDate().getYear() == year &&
                    order.getOrderDate().getMonth().getValue() == month)
            {
                commission += order.getOrderAmount();
            }
        }
        return baseSalary + commission;
    }
}
