package homework;

public class Account {
    private String name;
    private String accountNumber;
    private double balance;

    // Constructor with name, accountNumber, and initial balance
    public Account(String name, String accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Constructor with name and accountNumber only (assumes initial balance of zero)
    public Account(String name, String accountNumber) {
        this(name, accountNumber, 0.0);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

