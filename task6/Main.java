package com.tasks.task6;

public class Main {
    public static void main(String[] args) {
        //Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
        //изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
        //недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
        //заданное количество часов, минут и секунд.
        Time time = new Time(12, 30, 45);
        System.out.println("Current Time: " + time.getTime());

        // Изменение времени
        time.addTime(2, 15, 10);
        System.out.println("Updated Time: " + time.getTime());
        time.setTime(23,59,59);
        System.out.println(time.getTime());
    }
}

