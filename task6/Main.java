package com.tasks.task6;

public class Main {
    public static void main(String[] args) {
        Time time = new Time(12, 30, 45);
        System.out.println("Current Time: " + time.getTime());

        // Изменение времени
        time.addTime(2, 15, 10);
        System.out.println("Updated Time: " + time.getTime());
        time.setTime(23,59,59);
        System.out.println(time.getTime());
    }
}

