package com.tasks.agregation.task02;

public class Auto extends Wheel{
    String marka;

    Auto() { //конструктор
        super();
        marka = "новая марка";
    }

    Auto(int rad) {
        super(rad);
    }

    Auto(String m, int rad) {
        super(rad);
        marka = m;
    }

    void Move() {
        System.out.println("Проехали");
    }

    void ChangeWheel(int newWheel) {
        super.diam = newWheel * 2;
    }

    String toMarka() {
        return marka;
    }
}
