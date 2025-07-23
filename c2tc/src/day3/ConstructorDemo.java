package day3;

import java.util.Scanner;

public class ConstructorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, city;
        int id;

        System.out.print("Enter Customer Id : ");
        id = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter Customer Name : ");
        name = sc.nextLine();

        System.out.print("Enter Customer City : ");
        city = sc.nextLine();

        System.out.println();

        Customer c1 = new Customer(); // Default constructor invoked
        c1.setCustomerId(id);
        c1.setCustomerName(name);
        c1.setCustomerCity(city);

        System.out.println(c1);

        sc.close(); // Always close Scanner
    }
}