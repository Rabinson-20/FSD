package Oct23;

public class Bank {
	public static void main(String[] args) {
		CustomerAccount c = new CustomerAccount(1086100, "Rabinson", 100000);
        System.out.println("Account Holder: " + c.getAccountHolder());
        System.out.println("Initial Balance: " + c.getBalance());
        c.deposit(2000);
        c.withdraw(3000);
        System.out.println("Available Balance: " + c.getBalance());
        c.withdraw(15000);
	}
}
class CustomerAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    public CustomerAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Amount: " + amount);
        }
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Amount: " + amount);
        }
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
}

