package Lab4.prob5;

public abstract class Account {
    public String accountId;
    public double balance;

    public Account(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    public abstract double computeUpdatedBalance();
}
