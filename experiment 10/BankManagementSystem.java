// Abstract Class
abstract class BankAccount {
    // Encapsulation
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        balance += amount;
    }

    // Display Details
    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance : " + balance);
    }

    // Abstract Method
    abstract void calculateInterest();
}

// Savings Account Class
class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    void calculateInterest() {
        double interest = getBalance() * 0.04; // 4% interest
        System.out.println("Savings Account Interest = " + interest);
    }
}

// Current Account Class
class CurrentAccount extends BankAccount {

    public CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    void calculateInterest() {
        double interest = getBalance() * 0.02; // 2% interest
        System.out.println("Current Account Interest = " + interest);
    }
}

// Main Class
public class BankManagementSystem {
    public static void main(String[] args) {

        SavingsAccount sa =
                new SavingsAccount(101, "Ankit", 10000);

        CurrentAccount ca =
                new CurrentAccount(102, "Rahul", 15000);

        // Deposit Money
        sa.deposit(2000);
        ca.deposit(3000);

        System.out.println("Savings Account Details");
        sa.displayDetails();
        sa.calculateInterest();

        System.out.println();

        System.out.println("Current Account Details");
        ca.displayDetails();
        ca.calculateInterest();
    }
}