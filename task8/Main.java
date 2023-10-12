package com.tasks.task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Customers customers = new Customers(1);

        while (true) {
            System.out.println(
                    "Выберете пункт меню:\n" +
                            "0. выйти\n" +
                            "1. добавить покупателя\n" +
                            "2. вывод покупателей в алфавитном порядке\n" +
                            "3. вывод покупателей с кредитной картой в интервале\n" +
                            ": "
            );
            int choice = scanner.nextInt();
            if (choice == 0)
                break;
            if (choice < 1 || choice > 3) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }

            switch (choice) {
                case 1:
                    customers.push_back(Customer.getCustomer(scanner));
                    break;
                case 2:
                    customers.sortByName();
                    customers.print();
                    break;
                case 3:
                    System.out.println("Введи диапазон кредитных карт\n");
                    System.out.println("От: ");
                    String from = scanner.nextLine();
                    System.out.println("До: ");
                    String to = scanner.nextLine();
                    customers.printIfCardIn(from, to);
            }
        }
    }
}

