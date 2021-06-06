package exercises_11_03;

public class CheckingAccount
        extends Account {
    // Data fields

    private double overdraftLimit;

    /**
     * Construct a default CheckingAccount object
     */
    public CheckingAccount() {
        super();
        overdraftLimit = 0;
    }

    /**
     * Construct a CheckingAccout with specified id, balance and overdraftLimit
     */
    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * Set a new overdraft limit
     */
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * Return overdraft limit
     */
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    /**
     * Decrease balance by amount
     */
    @Override
    public void withdraw(double amount) {
        if(this.getBalance() + this.overdraftLimit < amount)
        {
            System.out.println("Value exceed the overdraft limit.");
            return;
        }
        this.balance -= amount;
    }

    /**
     * Return a String decription of CheckingAccount class
     */
    public String toString() {
        return super.toString() + "\nOverdraft limit: $"
                + String.format("%.2f", overdraftLimit);
    }
}
