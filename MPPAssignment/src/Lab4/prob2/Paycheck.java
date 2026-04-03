package Lab4.prob2;

public class Paycheck
{
    private double grossPay ;
    private final double fica =23.00;
    private final double state = 5.00;
    private final double local = 1.00;
    private final double medicare = 3.00;
    private final double socialSecurity = 7.5;


    public Paycheck(double grossPay) {
        this.grossPay = grossPay;
    }

    public double netPay()
    {
        return grossPay - (fica/100*grossPay) -
                (state/100*grossPay) -(local/100*grossPay)-
                (medicare/100*grossPay)-(socialSecurity/100*grossPay);
    }
}
