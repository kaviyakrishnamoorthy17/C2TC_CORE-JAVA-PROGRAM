package day6.assignment.assignmentpackage;

public abstract class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        Bank.incrementTotalAccounts();
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    public String getAccountNumber() {
        return accountNumber;
    }
}