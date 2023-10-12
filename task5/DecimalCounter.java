package com.tasks.task5;

public class DecimalCounter {
    private int minValue;
    private int maxValue;
    private int currentValue;


    public DecimalCounter() {
        this.minValue = 0;
        this.maxValue = 100;
        this.currentValue = 0;
    }

    public DecimalCounter(int minValue, int maxValue, int initialValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        setCurrentValue(initialValue);
    }


    public void increment() {
        if (currentValue < maxValue) {
            currentValue++;
        } else {
            System.out.println("Ошибка: Достигнуто максимальное значение счетчика.");
        }
    }

    public void decrement() {
        if (currentValue > minValue) {
            currentValue--;
        } else {
            System.out.println("Ошибка: Достигнуто минимальное значение счетчика.");
        }
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int value) {
        if (value >= minValue && value <= maxValue) {
            currentValue = value;
        } else {
            System.out.println("Ошибка: Заданное значение вне допустимого диапазона.");
        }
    }

}