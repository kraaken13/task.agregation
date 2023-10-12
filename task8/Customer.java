package com.tasks.task8;

import java.util.Comparator;
import java.util.Scanner;

public class Customer {
    private static int id;
    private String lastName;
    private String name;
    private String surname;
    private String address;
    private String creditNumber;
    private String bankAccountNumber;

    public Customer(String name_, String lastName_, String surname_,
                    String address_,
                    String creditNumber_, String bankAccountNumber_) {
        id = id++;
        name = name_;
        lastName = lastName_;
        surname = surname_;
        address = address_;
        creditNumber_ = creditNumber_;
        bankAccountNumber = bankAccountNumber_;
    }

    public String toString() {
        String string = "";
        string = string + id + ":" + name + " " + lastName + " " + surname +
                "." + address + " : " + creditNumber + " : " + bankAccountNumber;
        return string;
    }

    public void aPrint() {
        System.out.println(toString());
    }

    public static Customer getCustomer(Scanner scanner) {
        Customer customer = new Customer("", "", "", "", "", "");
        System.out.print("Name: ");
        customer.name = scanner.nextLine();
        System.out.print("Last Name: ");
        customer.lastName = scanner.nextLine();
        System.out.print("Surname: ");
        customer.surname = scanner.nextLine();
        System.out.print("Address: ");
        customer.address = scanner.nextLine();
        System.out.print("Credit Number: ");
        customer.creditNumber = scanner.nextLine();
        System.out.print("Account number: ");
        customer.bankAccountNumber = scanner.nextLine();
        return customer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public String getMame() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getCreditNumber() {
        return creditNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;

    }

    public static class ByNameComparator implements Comparator<Customer> {
        @Override
        public int compare(Customer left, Customer right) {
            if (left.surname != right.surname)
                return left.surname.compareTo(right.lastName);
            if (left.name != right.name)
                return left.name.compareTo(right.name);
            return left.surname.compareTo(right.surname);

        }
    }
}