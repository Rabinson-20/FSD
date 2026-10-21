
package oops;

public class Account {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.display();

        SavingsAccount s1 = new SavingsAccount();
        s1.display();

        CurrentAccount c1 = new CurrentAccount();
        c1.display();
    }
}

class BankAccount {
    int accNo = 1001;
    int balance = 25000;

    void display() {
        System.out.println("Account Number: "+accNo);
        System.out.println("Balance: "+balance);
    }
}

class SavingsAccount extends BankAccount {
    void display() {
        System.out.println("Savings Account");
        System.out.println("Account Number: "+accNo);
        System.out.println("Balance: "+balance);
    }
}

class CurrentAccount extends BankAccount {
    int accNo = 1002;
    int balance = 50000;

    void display() {
        System.out.println("Current Account");
        System.out.println("Account Number: "+accNo);
        System.out.println("Balance: "+balance);
    }
}
