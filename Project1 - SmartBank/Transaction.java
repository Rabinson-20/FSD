package SmartBank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {

    private String type;
    private double amount;
    private double resultingBalance;
    private String description;
    private LocalDateTime dateTime;

    public Transaction(String type, double amount,double resultingBalance,String description) {

        this.type = type;
        this.amount = amount;
        this.resultingBalance = resultingBalance;
        this.description = description;
        this.dateTime = LocalDateTime.now();
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getResultingBalance() {
        return resultingBalance;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {

        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        return String.format(
                "%-15s | Rs. %10.2f | Balance: Rs. %10.2f | %-25s | %s",
                type,
                amount,
                resultingBalance,
                description,
                dateTime.format(formatter)
        );
    }
}