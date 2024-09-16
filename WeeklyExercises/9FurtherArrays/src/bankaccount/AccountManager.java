package bankaccount;

public class AccountManager {
    private static final int MAX_CUSTOMERS = 30;
    private static int numCustomers = 0;
    private static SavingsAccount[] customers = new SavingsAccount[MAX_CUSTOMERS];

    public static void createAccount(int accountNumber, double initialBalance) {
        if (numCustomers < MAX_CUSTOMERS) {
            customers[numCustomers] = new SavingsAccount(accountNumber, initialBalance);
            numCustomers++;
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Cannot create more accounts. Bank is full.");
        }
    }

    public static SavingsAccount findAccount(int accountNumber) {
        for (int i = 0; i < numCustomers; i++) {
            if (customers[i].getAccountNumber() == accountNumber) {
                return customers[i];
            }
        }
        return null;
    }

    public static void addInterestToAllAccounts() {
        for (int i = 0; i < numCustomers; i++) {
            customers[i].addInterest();
        }
        System.out.println("Interest added to all accounts.");
    }
}


