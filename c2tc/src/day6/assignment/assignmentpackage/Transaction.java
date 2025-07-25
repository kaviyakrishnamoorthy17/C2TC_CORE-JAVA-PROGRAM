package day6.assignment.assignmentpackage;


public final class Transaction {
    private final double transactionFee = 10.0;

    public final void performTransaction(Account account, double amount, String type) {
        System.out.println("Performing transaction with fee: " + transactionFee);

        if ("deposit".equalsIgnoreCase(type)) {
            if (amount > transactionFee) {
                account.deposit(amount - transactionFee);
            } else {
                System.out.println("Amount must be greater than transaction fee.");
            }

        } else if ("withdraw".equalsIgnoreCase(type)) {
            double totalAmount = amount + transactionFee;

            double availableBalance = account.getBalance();
            if (account instanceof CheckingAccount) {
                availableBalance += ((CheckingAccount) account).getOverdraftLimit(); // ✅ fixed access
            }

            if (availableBalance >= totalAmount) {
                account.withdraw(totalAmount);
            } else {
                System.out.println("Insufficient balance including transaction fee.");
            }

        } else {
            System.out.println("Invalid transaction type.");
        }
    }

    public double getTransactionFee() {
        return transactionFee;
    }
}
