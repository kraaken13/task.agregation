package com.tasks.agregation.task03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
        //столицу, количество областей, площадь, областные центры.
        Scanner sc = new Scanner(System.in);
        Country country = new Country(Country.strInput(), Country.strInput());
        while (true) {
            System.out.println("Выберите команду:\n" +
                    "0 - выход\n" +
                    "1 - добавить область\n" +
                    "2 - вывести на консоль столицу\n" +
                    "3 - количество областей\n" +
                    "4 - площадь\n");

            int choice = Country.numInput();
            if (choice == 0) {
                break;
            }
            if (choice < 1 || choice > 5) {
                System.out.println("Повторите ввод");
                continue;
            }
            switch (choice) {
                case 1:
                    country.addCountry();
                    break;
                case 2:
                    System.out.println("Страна: " + country.getCountry());
                    System.out.println("Столица: " + country.getCapital());
                    break;
                case 3:
                    System.out.println("Кол - во областей: " + country.getRegionList().size());
                    break;
            }
        }
    }
}