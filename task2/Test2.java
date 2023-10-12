package com.tasks.task2;

public class Test2 {
    private int numberOne;
    private int numberTwo;

    public Test2(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public Test2() {
        this.numberOne=13;
        this.numberTwo=26;
    }

    public int getNumberOne() {
        return this.numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return this.numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }
}
