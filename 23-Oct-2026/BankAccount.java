package Oct23;

public class BankAccount {
    public static void main(String[] args) {
        Phonepay p = new Phonepay();
        System.out.println(p.getAccount_holder_name());
        System.out.println(p.getAccount_number());
        System.out.println(p.getAccount_balance());
        System.out.println(p.GetAccount_holder_email());
        
        p.setAccount_balance(150000);
        p.setAccount_holder_email("samp@gmail.com");

        System.out.println("Account Balance: " + p.getAccount_balance());
        System.out.println("Email: " + p.GetAccount_holder_email());
    }
}

class HDFC {
    private String account_holder_name = "Sam P";
    private long account_number = 1086100;
    private long account_balance = 100000;
    private String account_holder_email = "samrabinsonp@gmail.com";

    public String getAccount_holder_name() {
        return account_holder_name;
    }
    public long getAccount_number() {
        return account_number;
    }
    public long getAccount_balance() {
        return account_balance;
    }
    public String GetAccount_holder_email() {
        return account_holder_email;
    }
    public void setAccount_balance(long balance) {
        account_balance = balance;
    }
    public void setAccount_holder_email(String email) {
        account_holder_email = email;
    }
    void ShowBalance() {
        System.out.println(account_balance);
    }
}

class Phonepay extends HDFC {
}