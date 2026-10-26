package SmartBank;

public class CurrentAccount extends BankAccount {

    private static final double MAX_WITHDRAWAL = 50000.00;

    public CurrentAccount(String accountNumber,String customerName,String pin,double initialDeposit) {

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

        if (amount > MAX_WITHDRAWAL) {
            throw new BankException(
                    "Current Account withdrawal limit is Rs. 50000 per transaction."
            );
        }

        if (amount > getBalance()) {
            throw new BankException(
                    "Insufficient balance."
            );
        }

        completeWithdrawal(
                amount,
                "Current account withdrawal"
        );
    }

    @Override
    public String getAccountType() {
        return "Current Account";
    }
}