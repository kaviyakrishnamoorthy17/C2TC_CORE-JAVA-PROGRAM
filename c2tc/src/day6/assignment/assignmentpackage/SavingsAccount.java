package day6.assignment.assignmentpackage;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to SavingsAccount " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from SavingsAccount " + accountNumber);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void addInterest() {
        balance += balance * interestRate / 100;
        System.out.println("Interest added. New balance: " + balance);
    }
}