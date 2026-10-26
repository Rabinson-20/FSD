package SmartBank;

import java.util.Scanner;

public class SmartBank {

    private static Scanner scanner =new Scanner(System.in);

    private static Bank bank =new Bank();

    public static void main(String[] args) {

        System.out.println();
        System.out.println("========================================");
        System.out.println("          WELCOME TO SMARTBANK");
        System.out.println("       Console Banking System");
        System.out.println("========================================");

        boolean running = true;

        while (running) {
        	displayMenu();

            try {

                System.out.print("Enter your choice: ");

                int choice =Integer.parseInt(scanner.nextLine());

                switch (choice) {

                    case 1:
                        createAccount();
                        break;

                    case 2:
                        depositMoney();
                        break;

                    case 3:
                        withdrawMoney();
                        break;

                    case 4:
                        checkBalance();
                        break;

                    case 5:
                        transferMoney();
                        break;

                    case 6:
                        viewTransactionHistory();
                        break;

                    case 7:
                        displayAccountDetails();
                        break;

                    case 8:
                        running = false;

                        System.out.println();
                        System.out.println("Thank you for using SmartBank.");

                        System.out.println("Have a nice day!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please select 1-8.");
                }

            } catch (NumberFormatException e) {

                System.out.println("Invalid input. Please enter a number.");

            } catch (BankException e) {

                System.out.println("Transaction failed: "+ e.getMessage());
            }

            System.out.println();
        }

        scanner.close();
    }

    // Main menu
    private static void displayMenu() {

        System.out.println();
        System.out.println("========================================");
        System.out.println("             SMARTBANK MENU");
        System.out.println("========================================");

        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Balance");
        System.out.println("5. Transfer Money");
        System.out.println("6. View Transaction History");
        System.out.println("7. Display Account Details");
        System.out.println("8. Exit");

        System.out.println("========================================");
    }

    // Create account
    private static void createAccount()
            throws BankException {

        System.out.println();
        System.out.println("========== CREATE ACCOUNT ==========");

        System.out.print("Enter customer name: ");

        String name =scanner.nextLine();

        System.out.print("Enter 4-digit PIN: ");

        String pin =scanner.nextLine();

        System.out.println();
        System.out.println("Select Account Type:");

        System.out.println("1. Savings Account");

        System.out.println("2. Current Account");

        System.out.print("Enter choice: ");

        int type =Integer.parseInt(scanner.nextLine());

        System.out.print("Enter initial deposit: Rs. ");

        double initialDeposit =Double.parseDouble(scanner.nextLine());

        BankAccount account;

        if (type == 1) {

            account =bank.createSavingsAccount(name,pin,initialDeposit);

        }
        else if (type == 2) {

            account =bank.createCurrentAccount(name,pin,initialDeposit);

        } 
        else {

            throw new BankException("Invalid account type.");
        }

        System.out.println();
        System.out.println("Account created successfully!");

        System.out.println("Account Number : "+ account.getAccountNumber());

        System.out.println("Customer Name  : "+ account.getCustomerName());

        System.out.println("Account Type   : "+ account.getAccountType());

        System.out.printf("Balance        : Rs. %.2f%n",account.getBalance());
    }

    // Deposit money
    private static void depositMoney()
            throws BankException {

        System.out.println();
        System.out.println("========== DEPOSIT MONEY ==========");

        System.out.print("Enter account number: ");

        String accountNumber =scanner.nextLine();

        System.out.print("Enter deposit amount: Rs. ");

        double amount =Double.parseDouble(scanner.nextLine());

        System.out.print("Enter description (optional): ");

        String description =scanner.nextLine();

        if (description.trim().isEmpty()) {

            // Method overloading
            bank.findAccount(accountNumber).deposit(amount);

        } else {

            // Method overloading
            bank.deposit(accountNumber,amount,description);
        }

        System.out.println("Deposit successful.");

        System.out.printf("New Balance: Rs. %.2f%n",bank.findAccount(accountNumber).getBalance());
    }

    // Withdraw money
    private static void withdrawMoney() 
    		throws BankException {

        System.out.println();
        System.out.println("========== WITHDRAW MONEY ==========");

        System.out.print("Enter account number: ");

        String accountNumber =scanner.nextLine();

        System.out.print("Enter PIN: ");

        String pin =scanner.nextLine();

        System.out.print("Enter withdrawal amount: Rs. ");

        double amount =Double.parseDouble(scanner.nextLine());

        bank.withdraw(accountNumber,pin,amount);

        System.out.println("Withdrawal successful.");

        System.out.printf("Remaining Balance: Rs. %.2f%n",bank.findAccount(accountNumber).getBalance());
    }

    // Check balance
    private static void checkBalance()
    		throws BankException {

        System.out.println();
        System.out.println("========== CHECK BALANCE ==========");

        System.out.print("Enter account number: ");

        String accountNumber =scanner.nextLine();

        System.out.print("Enter PIN: ");

        String pin =scanner.nextLine();

        BankAccount account =bank.findAccount(accountNumber);

        double balance =bank.checkBalance(accountNumber,pin);

        System.out.println();

        System.out.println("Account Holder : "+ account.getCustomerName());

        System.out.println("Account Type   : "+ account.getAccountType());

        System.out.printf("Current Balance: Rs. %.2f%n",balance);
    }

    // Transfer money
    private static void transferMoney() 
    		throws BankException {

        System.out.println();
        System.out.println("========== FUND TRANSFER ==========");

        System.out.print("Enter sender account number: ");

        String sender =scanner.nextLine();

        System.out.print("Enter receiver account number: ");

        String receiver =scanner.nextLine();

        System.out.print("Enter sender PIN: ");

        String pin =scanner.nextLine();

        System.out.print("Enter transfer amount: Rs. ");

        double amount =Double.parseDouble(scanner.nextLine());

        bank.transfer(sender,receiver,pin,amount);

        System.out.println();
        System.out.println("Transfer successful!");

        System.out.println("From Account : " + sender);

        System.out.println("To Account   : " + receiver);

        System.out.printf("Amount       : Rs. %.2f%n",amount);
    }

    // Transaction history
    private static void viewTransactionHistory() 
    		throws BankException {

        System.out.println();
        System.out.println("====== TRANSACTION HISTORY ======");

        System.out.print("Enter account number: ");

        String accountNumber =scanner.nextLine();

        System.out.print("Enter PIN: ");

        String pin =scanner.nextLine();

        bank.displayTransactionHistory(accountNumber,pin);
    }

    // Account details
    private static void displayAccountDetails()
            throws BankException {

        System.out.println();
        System.out.println("====== ACCOUNT DETAILS ======");

        System.out.print("Enter account number: ");

        String accountNumber =scanner.nextLine();

        System.out.print("Enter PIN: ");

        String pin =scanner.nextLine();

        bank.displayAccountDetails(accountNumber,pin);
    }
}