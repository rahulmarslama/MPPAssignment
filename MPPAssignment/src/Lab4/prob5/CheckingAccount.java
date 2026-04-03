package Lab4.prob5;

public class CheckingAccount extends Account {
    private double monthlyFee;

    public CheckingAccount(String accountId, double monthlyFee,double balance) {
        super(accountId, balance);
        this.monthlyFee = monthlyFee;
    }


    @Override
    public double computeUpdatedBalance() {
        return balance- monthlyFee;
    }
}
