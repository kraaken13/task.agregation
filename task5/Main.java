package com.tasks.task5;

public class Main {

    public static void main(String[] args) {
        DecimalCounter counter1 = new DecimalCounter();
        System.out.println("Default Counter Value: " + counter1.getCurrentValue());


        counter1.increment();
        System.out.println("Incremented Counter Value: " + counter1.getCurrentValue());

        counter1.decrement();
        System.out.println("Decremented Counter Value: " + counter1.getCurrentValue());

        // Создание счетчика с произвольными значениями
        DecimalCounter counter2 = new DecimalCounter(2, 20, 5);
        System.out.println("Custom Counter Value: " + counter2.getCurrentValue());

        // Установка произвольного значения с проверкой допустимости
        counter2.setCurrentValue(10);
        System.out.println("Updated Counter Value: " + counter2.getCurrentValue());
    }
}