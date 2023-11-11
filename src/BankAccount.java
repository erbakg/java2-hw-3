public class BankAccount {

    double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        this.amount = this.amount + sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException("Not enough money", (sum - amount));
        }
        this.amount = this.amount - sum;
    }
}
