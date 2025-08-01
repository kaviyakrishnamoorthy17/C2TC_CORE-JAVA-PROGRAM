package assignment2;

import java.util.Scanner; // Then imports

class Commission {
    // Data members
    String name, address;
    String phone;
    double salesAmount;

    // Method to accept employee details
    void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        phone = sc.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
        sc.close();
    }

    // Method to calculate and display commission
    void calculateCommission() {
        double commission = 0;

        if (salesAmount >= 100000) {
            commission = 0.10 * salesAmount;
        } else if (salesAmount >= 50000) {
            commission = 0.05 * salesAmount;
        } else if (salesAmount >= 30000) {
            commission = 0.03 * salesAmount;
        }

        System.out.println("Commission for " + name + " is: ₹" + commission);
    }
}