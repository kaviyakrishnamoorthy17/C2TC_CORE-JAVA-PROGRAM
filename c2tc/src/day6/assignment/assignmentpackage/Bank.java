package day6.assignment.assignmentpackage;

public class Bank {
    private static int totalAccounts = 0;

    public static void incrementTotalAccounts() {
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}