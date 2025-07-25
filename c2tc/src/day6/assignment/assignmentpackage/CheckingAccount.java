package day6.assignment.assignmentpackage;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to CheckingAccount " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from CheckingAccount " + accountNumber);
        } else {
            System.out.println("Insufficient balance and overdraft limit or invalid amount.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}