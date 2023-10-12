package com.tasks.task8;

import java.util.*;

public class Customers {


    private Customer[] customers;
    private int capacity;
    private int size;


    public Customers(int capacity_) {
        size = 0;
        capacity = capacity_;
        customers = new Customer[capacity];
    }

    public Customers() {
        this(10);
    }
    public void push_back(Customer customer) {
        if (size < capacity) {
            customers[size] = customer;
            size++;
        } else {
            Customer[] buffer = new Customer[capacity * 2];
            for (int i = 0; i < size; ++i) {
                buffer[i] = customers[i];
            }
            customers = buffer;
            capacity = capacity * 2;
            customers[size] = customer;
            size++;
        }
    }


    public void print() {
        for (int i = 0; i < size; ++i) {
            customers[i].aPrint();
        }
    }

    public void sortByName() {
        Arrays.sort(customers, 0, size, new Customer.ByNameComparator());
    }

    public void printIfCardIn(String a, String b) {
        for (int i = 0; i < size; ++i) {
            if (customers[i].getCreditNumber().compareTo(a) >= 0 && customers[i].getBankAccountNumber().compareTo(b) <= 0)
                customers[i].aPrint();

        }
    }
}