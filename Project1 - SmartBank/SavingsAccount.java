package SmartBank;

public class SavingsAccount extends BankAccount {

    private static final double MIN_BALANCE = 500.00;

    public SavingsAccount(String accountNumber,String customerName,String pin,double initialDeposit) {

        super(
                accountNumber,
                customerName,
                pin,
                initialDeposit
        );
    }

    // Method overriding
    @Override
    public void withdraw(double amount)
            throws BankException {

        if (amount <= 0) {
            throw new BankException(
                    "Withdrawal amount must be greater than zero."
            );
        }

        if (getBalance() - amount < MIN_BALANCE) {
            throw new BankException(
                    "Savings Account must maintain a minimum balance of Rs. 500."
            );
        }

        completeWithdrawal(
                amount,
                "Savings account withdrawal"
        );
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }
}