package day6.assignment.assignmentpackage;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA101", 5000, 3.5);
        CheckingAccount checking = new CheckingAccount("CA101", 2000, 1000);

        System.out.println("Total accounts before transactions: " + Bank.getTotalAccounts());

        Transaction transaction = new Transaction();

        transaction.performTransaction(savings, 1000, "deposit");
        transaction.performTransaction(checking, 500, "withdraw");

        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Checking Account Balance: " + checking.getBalance());

        savings.addInterest();

        System.out.println("Total accounts after transactions: " + Bank.getTotalAccounts());
    }
}