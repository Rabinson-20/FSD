package SmartBank;

import java.util.ArrayList;

public abstract class BankAccount {

    // Encapsulation
    private String accountNumber;
    private String customerName;
    private String pin;
    private double balance;

    private ArrayList<Transaction> transactions;

    // Constructor
    public BankAccount(String accountNumber,String customerName,String pin,double initialDeposit) {

        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.pin = pin;
        this.balance = initialDeposit;

        transactions = new ArrayList<Transaction>();

        transactions.add(
                new Transaction(
                        "DEPOSIT",
                        initialDeposit,
                        balance,
                        "Initial deposit"
                )
        );
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    // PIN validation
    public boolean verifyPin(String enteredPin) {
        return pin.equals(enteredPin);
    }

    // Used by subclasses
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Method overloading - version 1
    public void deposit(double amount) throws BankException {
        deposit(amount, "Cash deposit");
    }

    // Method overloading - version 2
    public void deposit(double amount,String description)
            throws BankException {

        if (amount <= 0) {
            throw new BankException(
                    "Deposit amount must be greater than zero."
            );
        }

        balance = balance + amount;

        transactions.add(new Transaction("DEPOSIT",amount,balance,description)
        );
    }

    // Abstract method
    public abstract void withdraw(double amount)
            throws BankException;

    // Common withdrawal operation
    protected void completeWithdrawal(double amount,String description)
            throws BankException {

        if (amount <= 0) {
            throw new BankException(
                    "Withdrawal amount must be greater than zero."
            );
        }

        balance = balance - amount;

        transactions.add(new Transaction("WITHDRAW",amount,balance,description));
    }

    // Transfer money into account
    public void addTransferCredit(
            double amount,
            String description)
            throws BankException {

        if (amount <= 0) {
            throw new BankException(
                    "Transfer amount must be greater than zero."
            );
        }

        balance = balance + amount;

        transactions.add(new Transaction("TRANSFER IN",amount,balance,description));
    }

    // Transfer money out of account
    public void addTransferDebit(double amount,String description)
            throws BankException {

        if (amount <= 0) {
            throw new BankException(
                    "Transfer amount must be greater than zero."
            );
        }

        balance = balance - amount;

        transactions.add(new Transaction("TRANSFER OUT",amount,balance,description));
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    // Polymorphism
    public abstract String getAccountType();

    public void displayBasicDetails() {

        System.out.println("----------------------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Account Type   : " + getAccountType());
        System.out.println("----------------------------------------");
    }

    public void displayAccountDetails() {

        displayBasicDetails();

        System.out.printf("Balance        : Rs. %.2f%n",balance);

        System.out.println("----------------------------------------");
    }
}