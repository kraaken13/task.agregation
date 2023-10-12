package com.tasks.agregation.task02;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Нива", 9);
        auto.ChangeWheel(8);
        auto.Move();
        String st = auto.toMarka();
        System.out.println(st);
    }
}
