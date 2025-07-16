package com.revature.day03;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer();

        Customer c2 = new Customer("Jyothi", 22);

        c1.displayInfo();
        c2.displayInfo("Customer Info");

        // Access static method and variable
        Customer.printCustomerCount();  // prints total number of customers

        // Access final variable
        System.out.println("Customer 1 ID (final): " + c1.custID);
        System.out.println("Customer 2 ID (final): " + c2.custID);
    }
}
