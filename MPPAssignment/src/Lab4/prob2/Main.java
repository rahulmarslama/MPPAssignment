package Lab4.prob2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    static void main()
    {
        Order order  = new Order(1, LocalDate.now(),1000);
        Order order2  = new Order(2, LocalDate.now(),5000);

        Employee commissionEmployee = new CommissionEmployee(1,2000,
                new ArrayList<>(Arrays.asList(order,order2)));

        Paycheck paycheck = commissionEmployee.calcCompensation(LocalDate.now().getMonthValue(),
                LocalDate.now().getYear());

        System.out.println(paycheck.netPay());


        Employee salariedEmployee = new SalariedEmployee(2,2000);
        Paycheck paycheck2 = salariedEmployee.calcCompensation
                (LocalDate.now().getMonthValue(),
                        LocalDate.now().getYear());
        System.out.println(paycheck2.netPay());


        Employee hourlyEmployee = new HourlyEmployee(3,40,20);
        Paycheck paycheck3 = hourlyEmployee.calcCompensation
                (LocalDate.now().getMonthValue(),
                        LocalDate.now().getYear());
        System.out.println(paycheck3.netPay());
    }
}
