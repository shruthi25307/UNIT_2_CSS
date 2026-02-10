import java.io.*;
import java.util.*;
abstract class BankAccount {
    private String accountHolder;
    private double balance;
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit successful!");
    }
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public void showAccount() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Balance: Rs. " + getBalance());
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("               BANK ACCOUNT MANAGEMENT                 ");
        System.out.println("=======================================================");
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        SavingsAccount acc = new SavingsAccount(name, balance);
        while (true) {
            System.out.println("\n1. View Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                acc.showAccount();
            }
            else if (choice == 2) {
                System.out.print("Enter amount to deposit: ");
                double amt = sc.nextDouble();
                acc.deposit(amt);
            }
            else if (choice == 3) {
                System.out.print("Enter amount to withdraw: ");
                double amt = sc.nextDouble();
                acc.withdraw(amt);
            }
            else if (choice == 4) {
                System.out.println("Thank you for using banking system!");
                break;
            }
            else {
                System.out.println("Invalid choice");
            }
        }
        sc.close();}}
