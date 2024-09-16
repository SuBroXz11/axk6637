package homework;

public class Transaction {
    public static void main(String[] args) {
        // Creating accounts with different constructors
        Account account1 = new Account("John Doe", "123456", 1000.0);
        Account account2 = new Account("Jane Doe", "654321");
        
        // Displaying account information
        System.out.println("Account 1: " + account1.getName() + " - " + account1.getAccountNumber() + " - Balance: " + account1.getBalance());
        System.out.println("Account 2: " + account2.getName() + " - " + account2.getAccountNumber() + " - Balance: " + account2.getBalance());

        // Performing transactions
        account1.deposit(500);
        account2.withdraw(200);

        // Displaying updated balances
        System.out.println("Account 1: " + account1.getName() + " - Balance: " + account1.getBalance());
        System.out.println("Account 2: " + account2.getName() + " - Balance: " + account2.getBalance());
    }
}

