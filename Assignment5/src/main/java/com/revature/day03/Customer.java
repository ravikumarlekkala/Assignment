package com.revature.day03;

public class Customer {
    public static int total = 0;

    public final String custID;

    private String name;
    private int age;

    public Customer() {
        this("Ravi", 21);
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        this.custID = "CUST" + (++total);
    }

    public void displayInfo() {
        System.out.println("Customer ID: " + custID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void displayInfo(String prefix) {
        System.out.println(prefix + " -> Customer ID: " + custID + ", Name: " + name + ", Age: " + age);
    }

    public static void printCustomerCount() {
        System.out.println("Total Customers: " + total);
    }
}
