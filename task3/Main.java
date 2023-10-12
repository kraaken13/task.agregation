package com.tasks.task3;


import static com.tasks.task3.Student.showBest;

public class Main {
    public static void main(String[] args) {
        // Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
        //из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
        //номеров групп студентов, имеющих оценки, равные только 9 или 10.
        Student[] listStudent = {
                new Student("Ivanov", 11, new int[]{5, 6, 7, 3, 9}),
                new Student("Petrov", 11, new int[]{7, 10, 9, 7, 3}),
                new Student("Pytin", 12, new int[]{4, 4, 4, 4, 10}),
                new Student("Timaty", 13, new int[]{4, 10, 7, 6, 9}),
                new Student("Loiko", 11, new int[]{9, 10, 8, 9, 9}),
                new Student("Izov", 12, new int[]{10, 9, 7, 7, 10}),
                new Student("Kolosov", 13, new int[]{9, 10, 9, 9, 9})
        };
        showBest(listStudent);
    }
}


