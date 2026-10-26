package SmartBank;

import java.util.ArrayList;

public class Bank {

    private ArrayList<BankAccount> accounts;

    private int accountCounter = 1001;

    public Bank() {
        accounts = new ArrayList<BankAccount>();
    }

    // Generate unique account number
    private String generateAccountNumber() {

        String accountNumber =String.format("SB%04d", accountCounter);

        accountCounter++;

        return accountNumber;
    }

    // Create Savings Account
    public BankAccount createSavingsAccount(String name,String pin,double initialDeposit)
            throws BankException {

        validateCustomerDetails(name, pin);

        if (initialDeposit < 500) {
            throw new BankException(
                    "Minimum initial deposit for Savings Account is Rs. 500."
            );
        }

        String accountNumber =generateAccountNumber();

        BankAccount account =
                new SavingsAccount(
                        accountNumber,
                        name,
                        pin,
                        initialDeposit
                );

        accounts.add(account);

        return account;
    }

    // Create Current Account
    public BankAccount createCurrentAccount(
            String name,
            String pin,
            double initialDeposit)
            throws BankException {

        validateCustomerDetails(name, pin);

        if (initialDeposit < 1000) {
            throw new BankException(
                    "Minimum initial deposit for Current Account is Rs. 1000."
            );
        }

        String accountNumber =generateAccountNumber();

        BankAccount account =
                new CurrentAccount(
                        accountNumber,
                        name,
                        pin,
                        initialDeposit
                );

        accounts.add(account);

        return account;
    }

    // Validate customer details
    private void validateCustomerDetails(
            String name,
            String pin)
            throws BankException {

        if (name == null || name.trim().isEmpty()) {
            throw new BankException(
                    "Customer name cannot be empty."
            );
        }

        if (!name.matches("[a-zA-Z ]+")) {
            throw new BankException(
                    "Customer name can contain only letters and spaces."
            );
        }

        if (pin == null || !pin.matches("\\d{4}")) {
            throw new BankException(
                    "PIN must contain exactly 4 digits."
            );
        }
    }

    // Search account
    public BankAccount findAccount(
            String accountNumber)
            throws BankException {

        for (BankAccount account : accounts) {

            if (account.getAccountNumber().equalsIgnoreCase(accountNumber)) {

                return account;
            }
        }

        throw new BankException(
                "Account not found."
        );
    }

    // Deposit
    public void deposit(
            String accountNumber,
            double amount,
            String description)
            throws BankException {

        BankAccount account =findAccount(accountNumber);

        account.deposit(
                amount,
                description
        );
    }

    // Withdraw
    public void withdraw(
            String accountNumber,
            String pin,
            double amount)
            throws BankException {

        BankAccount account =findAccount(accountNumber);

        if (!account.verifyPin(pin)) {
            throw new BankException(
                    "Invalid PIN."
            );
        }

        account.withdraw(amount);
    }

    // Check balance
    public double checkBalance(
            String accountNumber,
            String pin)
            throws BankException {

        BankAccount account =findAccount(accountNumber);

        if (!account.verifyPin(pin)) {
            throw new BankException(
                    "Invalid PIN."
            );
        }

        return account.getBalance();
    }

    // Fund transfer
    public void transfer(
            String senderNumber,
            String receiverNumber,
            String pin,
            double amount)
            throws BankException {

        if (senderNumber.equalsIgnoreCase(receiverNumber)) {
            throw new BankException(
                    "Sender and receiver cannot be the same."
            );
        }

        BankAccount sender =findAccount(senderNumber);

        BankAccount receiver =findAccount(receiverNumber);

        if (!sender.verifyPin(pin)) {
            throw new BankException(
                    "Invalid sender PIN."
            );
        }

        if (amount <= 0) {
            throw new BankException(
                    "Transfer amount must be greater than zero."
            );
        }

        if (amount > sender.getBalance()) {
            throw new BankException(
                    "Insufficient balance."
            );
        }

        // Savings minimum balance
        if (sender instanceof SavingsAccount) {

            if (sender.getBalance() - amount < 500) {
                throw new BankException(
                        "Savings Account must maintain a minimum balance of Rs. 500."
                );
            }
        }

        // Current transfer limit
        if (sender instanceof CurrentAccount) {

            if (amount > 50000) {
                throw new BankException(
                        "Current Account transfer limit is Rs. 50000."
                );
            }
        }

        // Deduct sender
        sender.addTransferDebit(amount,"Transfer to " + receiverNumber);

        // Add receiver
        receiver.addTransferCredit(amount,"Transfer from " + senderNumber);
    }

    // Display transaction history
    public void displayTransactionHistory(
            String accountNumber,
            String pin)
            throws BankException {

        BankAccount account =findAccount(accountNumber);

        if (!account.verifyPin(pin)) {
            throw new BankException(
                    "Invalid PIN."
            );
        }

        System.out.println();
        System.out.println("========== TRANSACTION HISTORY ==========");

        System.out.println("Account : "+ account.getAccountNumber());

        System.out.println("Name    : "+ account.getCustomerName());

        System.out.println();

        if (account.getTransactions().isEmpty()) {

            System.out.println("No transactions found.");

        } else {

            for (Transaction transaction :account.getTransactions()) {

                System.out.println(transaction);
            }
        }

        System.out.println("==========================================");
    }

    // Display account details
    public void displayAccountDetails(
            String accountNumber,
            String pin)
            throws BankException {

        BankAccount account =findAccount(accountNumber);

        account.displayBasicDetails();

        if (!account.verifyPin(pin)) {
            throw new BankException(
                    "Invalid PIN. Balance cannot be displayed."
            );
        }

        System.out.printf("Current Balance : Rs. %.2f%n",account.getBalance());

        System.out.println("----------------------------------------");
    }
}