package bankaccount;
import java.util.Scanner;
import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. Add Interest to All Accounts\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    int accNum = scanner.nextInt();
                    System.out.print("Enter initial balance: ");
                    double initBal = scanner.nextDouble();
                    AccountManager.createAccount(accNum, initBal);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    int accNumDep = scanner.nextInt();
                    SavingsAccount accDep = AccountManager.findAccount(accNumDep);
                    if (accDep != null) {
                        System.out.print("Enter deposit amount: ");
                        double depAmount = scanner.nextDouble();
                        accDep.deposit(depAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    int accNumWith = scanner.nextInt();
                    SavingsAccount accWith = AccountManager.findAccount(accNumWith);
                    if (accWith != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withAmount = scanner.nextDouble();
                        accWith.withdraw(withAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    AccountManager.addInterestToAllAccounts();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        scanner.close();
    }
}

